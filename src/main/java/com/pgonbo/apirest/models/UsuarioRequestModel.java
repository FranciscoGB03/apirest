package com.pgonbo.apirest.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class UsuarioRequestModel {
    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String password;

}
