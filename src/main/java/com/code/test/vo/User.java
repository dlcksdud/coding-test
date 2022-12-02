package com.code.test.vo;

import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class User {
    private String username;
    private String phone;
    private String email;
    private String password;
    private String role;



}
