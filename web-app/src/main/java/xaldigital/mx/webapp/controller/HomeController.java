package xaldigital.mx.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {        
        return "/home";
    }    
}
