package org.example.dinepoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/service")
    public String service() {
        return "/service";
    }

    @GetMapping("/menu")
    public String menu() {
        return "/menu";
    }

    @GetMapping("/team")
    public String team() {
        return "/team";
    }

    @GetMapping("/testimonial")
    public String testimonials() {
        return "/testimonial";
    }

    @GetMapping("/contact")
    public String contact() {
        return "/contact";
    }
}


