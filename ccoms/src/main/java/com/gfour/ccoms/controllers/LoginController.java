package com.gfour.ccoms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfour.ccoms.dtos.LoginDTO;
import com.gfour.ccoms.services.LoginService;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("")
    public ResponseEntity<LoginDTO> login(@RequestBody LoginDTO loginDTO) throws Exception{
        return  ResponseEntity.ok(this.loginService.login(loginDTO));
    }
}
