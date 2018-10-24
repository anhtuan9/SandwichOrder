package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sandwich {
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }

    @PostMapping
    public ModelAndView order(@RequestParam("check") String[] condiment, Model up) {
        String str1 = "";
        for (int i = 0; i < condiment.length; i++) {
            str1 += condiment[i] + " ";
        }
        String str = "sandwich của bạn có " + str1;
        up.addAttribute("str", str);
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}
