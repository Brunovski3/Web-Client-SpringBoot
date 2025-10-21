package com.api.externa.web.dto;

import lombok.Data;

@Data
public class PostDTO {
    private Integer id;
    private Integer userId;
    private String title;
    private String completed;
}
