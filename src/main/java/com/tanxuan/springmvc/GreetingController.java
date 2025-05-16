package com.tanxuan.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
        @GetMapping("/hello-xuan")
        public String greet(Model model) {
            model.addAttribute("name", "Xuan");
            return "greeting";
        }
}
