package ir.codefather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class TestController {

    @RequestMapping("/")
    public String hello(Locale locale, Model model) {
        System.out.println("Wellcome " + locale);
        return "home";
    }
}
