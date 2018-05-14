package com.example.tim.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController
{
    @GetMapping(value = "/")
    public String average()
    {
        return "View";
    }
}
