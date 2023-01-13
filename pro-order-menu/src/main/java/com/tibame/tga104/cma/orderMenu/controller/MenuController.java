package com.tibame.tga104.cma.orderMenu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tibame.tga104.cma.orderMenu.model.MenuVO;
import com.tibame.tga104.cma.orderMenu.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    /**
     * 顯示菜單
     * */
    @GetMapping("/Allmenu")
    public List<MenuVO> getAll() {
        return menuService.getAll();
    }
}


