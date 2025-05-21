package com.tanxuan.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
        @GetMapping("/plus")
        public String plus(Model model, @RequestParam(name = "first", defaultValue = "5") int a,@RequestParam(name ="second", defaultValue = "7") int b) {
            int result = a + b;
            model.addAttribute("first", a);
            model.addAttribute("second", b);
            model.addAttribute("result", result);
            return "greeting";
        }


        @GetMapping("/minus")
        public String minus(Model model,
        @RequestParam(name = "third", defaultValue = "0") int c,
        @RequestParam(name = "four", defaultValue = "0") int d) {
            int result = c - d;
            model.addAttribute("third", c);
            model.addAttribute("four", d);
            model.addAttribute("result", result);
            return "minus";
        }
}

