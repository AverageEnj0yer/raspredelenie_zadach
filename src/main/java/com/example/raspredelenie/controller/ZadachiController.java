package com.example.raspredelenie.controller;

import com.example.raspredelenie.entity.Zadachi;
import com.example.raspredelenie.service.ZadachiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ZadachiController {

    @Autowired
    private ZadachiService zadachiService;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Zadachi> taskList = zadachiService.getAll();
        model.addAttribute("taskList", taskList);
        model.addAttribute("taskSize", taskList.size());
        return "zadachi";
    }
    @RequestMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        zadachiService.delete(id);
        return "redirect:/";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Zadachi task) {
        zadachiService.save(task);
        return "redirect:/";
    }
}
