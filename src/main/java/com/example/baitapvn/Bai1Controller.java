package com.example.baitapvn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Bai1Controller {
    @RequestMapping("/bai1")
    public String bailam1(@RequestParam(name = "str1") String str1, @RequestParam(name = "str2") String str2, Model model) {
        StringBuilder lonhon = new StringBuilder();
        if (str1.length() > str2.length()) {
            lonhon.append(str1);
        } else if (str1.length() < str2.length()) {
            lonhon.append(str2);
        } else {
            lonhon.append("bằng nhau");
        }
        // truyền dc liệu thông qua addAttribute đến view
        model.addAttribute("lonhon1",str1);
        model.addAttribute("lonhon2",str2);
        model.addAttribute("lonhon", lonhon);
        return "bai1";
    }
}
