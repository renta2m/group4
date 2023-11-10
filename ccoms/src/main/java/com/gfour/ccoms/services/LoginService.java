package com.gfour.ccoms.services;

import com.gfour.ccoms.dtos.LoginDTO;

public interface LoginService {
    LoginDTO login(LoginDTO loginDTO) throws Exception;
}
