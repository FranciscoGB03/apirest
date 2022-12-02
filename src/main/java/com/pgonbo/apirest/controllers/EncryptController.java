package com.pgonbo.apirest.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pgonbo.apirest.models.EncodeRequestModel;

@RequestMapping("/encoding")
public interface EncryptController {

    @PostMapping()
    public String getEncode(@RequestBody EncodeRequestModel request) throws Exception;

}
