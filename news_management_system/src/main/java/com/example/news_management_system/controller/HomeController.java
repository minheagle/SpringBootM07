package com.example.news_management_system.controller;

import com.example.news_management_system.domain.NewDomain;
import com.example.news_management_system.entity.NewEntity;
import com.example.news_management_system.service.category.ICategoryService;
import com.example.news_management_system.service.news.INewService;
import com.example.news_management_system.service.staff.IStaffService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    private final INewService newService;
    private final IStaffService staffService;
    private final ICategoryService categoryService;

    public HomeController(INewService newService, IStaffService staffService, ICategoryService categoryService) {
        this.newService = newService;
        this.staffService = staffService;
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("news", newService.getAll());
        return "home/index";
    }

    @GetMapping("create")
    public String createForm(Model model){
        model.addAttribute("newDomain", new NewDomain());
        model.addAttribute("staffList", staffService.getAll());
        model.addAttribute("categoryList", categoryService.getAll());
        return "home/create";
    }

    @PostMapping("create")
    public String create(Model model, @Valid NewDomain newDomain, BindingResult bindingResult,
                         @RequestParam("category") Long cateId , @RequestParam("staff") Long staffId){
        if(bindingResult.hasErrors()){
            return "home/create";
        }
        try{
            newDomain.setStaffId(staffId);
            newDomain.setCateId(cateId);
            newService.create(newDomain, cateId, staffId);
            return "home/index";
        }catch (Exception e){
            model.addAttribute("error", e.getMessage());
            return "home/create";
        }
    }
}
