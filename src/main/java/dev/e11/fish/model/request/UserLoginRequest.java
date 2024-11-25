package dev.e11.fish.model.request;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String username;
    private String password;
}
