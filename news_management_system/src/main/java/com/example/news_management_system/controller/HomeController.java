package com.example.news_management_system.controller;

import com.example.news_management_system.domain.NewDomain;
import com.example.news_management_system.entity.NewEntity;
import com.example.news_management_system.service.news.INewService;
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
    private final ModelMapper modelMapper;

    public HomeController(INewService newService, ModelMapper modelMapper) {
        this.newService = newService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("news", newService.getAll());
        return "index";
    }

    @GetMapping("create")
    public String createForm(Model model){
        model.addAttribute("newDomain", new NewDomain());
        return "create";
    }

    @PostMapping("create")
    public String create(Model model, @Valid NewDomain newDomain, BindingResult bindingResult,
                         @RequestParam("category") Long cateId , @RequestParam("staff") Long staffId){
        if(bindingResult.hasErrors()){
            return "create";
        }
        try{
            NewEntity newEntity = modelMapper.map(newDomain, NewEntity.class);
            newService.create(newEntity);
            return "index";
        }catch (Exception e){
            model.addAttribute("error", e.getMessage());
            return "create";
        }
    }
}
