package com.codingshuttle.SecurityApp.SecurityApplication.dto;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

    private Long id;

    private String title;

    private String description;
}
