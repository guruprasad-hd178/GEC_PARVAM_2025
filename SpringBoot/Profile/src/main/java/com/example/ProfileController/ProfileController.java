package com.example.ProfileController;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProfileController {

    @GetMapping({"","/"})
    public String home() {
        return "home";
    }


}
