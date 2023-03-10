package com.example.segomarketnew.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import javax.validation.constraints.NotBlank;
@Data
@Builder
@AllArgsConstructor
public class AuthRequest {
    @NotBlank(message = "Name must not be empty")
    private String name;
    @NotBlank(message = "Password must not be empty")
    private String password;
}
