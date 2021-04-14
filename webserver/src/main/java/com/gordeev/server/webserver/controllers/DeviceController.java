package com.gordeev.server.webserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeviceController {

    @GetMapping("/device")
    public String mainPage(Model model) {
        model.addAttribute("title", "Оборудование");
        return "devicePage";
    }
}