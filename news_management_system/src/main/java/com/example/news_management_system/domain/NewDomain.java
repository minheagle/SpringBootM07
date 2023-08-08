package com.example.news_management_system.domain;

import com.example.news_management_system.entity.CategoryEntity;
import com.example.news_management_system.entity.StaffEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewDomain {
    private long newsId;

    @NotBlank(message = "Title is required !")
    private String title;

    @NotBlank(message = "Summary is required !")
    private String summary;

    @NotBlank(message = "Contents is required !")
    private String contents;

    private Date createdDate;

    private long staffId;

    private long cateId;
}
