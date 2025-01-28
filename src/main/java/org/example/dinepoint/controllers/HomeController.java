package org.example.dinepoint.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request, HttpServletResponse response) {
        return "/about";
    }

    @GetMapping("/service")
    public String service(HttpServletRequest request, HttpServletResponse response) {
        return "/service";
    }

    @GetMapping("/menu")
    public String menu(HttpServletRequest request, HttpServletResponse response) {
        return "/menu";
    }

    @GetMapping("/team")
    public String team(HttpServletRequest request, HttpServletResponse response) {
        return "/team";
    }

    @GetMapping("/testimonial")
    public String testimonials(HttpServletRequest request, HttpServletResponse response) {
        return "/testimonial";
    }

    @GetMapping("/contact")
    public String contact(HttpServletRequest request, HttpServletResponse response) {
        return "/contact";
    }
}


