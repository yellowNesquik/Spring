package com.gordeev.server.webserver.controllers;

import com.gordeev.server.webserver.domain.Device;
import com.gordeev.server.webserver.repos.DeviceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private DeviceRepo deviceRepo;


    @GetMapping("/")
    public String mainPage(Map<String, Object> model) {
        Iterable<Device> devices = deviceRepo.findAll();
        model.put("devices", devices);
        return "mainPage";
    }

    @PostMapping()
    public String add(@RequestParam(required = false) String name, @RequestParam  String status, Map<String, Object> model){

        Device device = new Device(name, status);
        deviceRepo.save(device);
        Iterable<Device> devices = deviceRepo.findAll();
        model.put("devices", devices);

        return "mainPage";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Device> getAllUsers() {
        // This returns a JSON or XML with the users
        return deviceRepo.findAll();
    }

}