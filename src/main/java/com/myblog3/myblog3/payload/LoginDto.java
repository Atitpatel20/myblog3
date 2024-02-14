package com.myblog3.myblog3.payload;

import lombok.Data;
@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
