package com.gfour.ccoms.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfour.ccoms.entities.Menu;
import com.gfour.ccoms.repositories.MenuRepo;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuRepo menuRepo;

    @GetMapping("/all")
    public List<Menu> getAll() {
        Iterable<Menu>  menuItems = menuRepo.findAll();
        List<Menu> menuList = new ArrayList<>();
        menuItems.forEach(item -> {
            menuList.add(item);
        });

        return menuList;
    }
}
