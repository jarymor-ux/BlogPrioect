package com.ostap.blogprioect.Model;

import com.ostap.blogprioect.Enums.UserStatusEnums;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@RequiredArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private UserStatusEnums status = UserStatusEnums.NOT_BLOCKED;
    @NotNull(message = "Field name not may be empty")
    private String name;
    @NotNull(message = "Field surname not may be empty")
    private String surname;
    @NotNull(message = "Password field not may be empty")
    private String password;
    @NotNull(message = "Input your email")
    private String email;
    
}
