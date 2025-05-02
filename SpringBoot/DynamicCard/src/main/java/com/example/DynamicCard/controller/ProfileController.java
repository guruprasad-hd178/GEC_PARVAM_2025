package com.example.DynamicCard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DynamicCard.model.Profile;
import com.example.DynamicCard.profileDTO.ProfileDTO;
import com.example.DynamicCard.repository.ProfileRepository;
import com.example.DynamicCard.service.ProfileService;

@Controller

public class ProfileController {

    @Autowired
    private ProfileService service;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("profileDTO", new ProfileDTO());
        model.addAttribute("profiles", service.getAllProfiles());
        return "index";
    }

    @PostMapping("/add")
    public String addProfile(@ModelAttribute("profileDTO") ProfileDTO dto) {
        service.saveProfile(dto);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteProfile(@PathVariable Long id) {
        service.deleteProfile(id);
        return "redirect:/";
    }
}
