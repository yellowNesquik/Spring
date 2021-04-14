package com.gordeev.server.webserver.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest")
public class MessageController {
    public List<Map<String, String>> statuses = new ArrayList<Map<String,String>>(){{
        add(new HashMap<String, String>() {{put("id", "1"); put("status", "Active");}});
    }};
    @GetMapping
    public List<Map<String, String>> list(Model model) {
        return statuses;
    }
}