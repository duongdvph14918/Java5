package com.example.baitapvn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Bai2Controller {
    @RequestMapping("/bai2")
    public String bailam2(@RequestParam(name = "str1") String str1 , Model model, Model model1){
        StringBuilder daonguoc = new StringBuilder(str1);
// truyền dc liệu thông qua addAttribute đến view
        model1.addAttribute("daonguocbandau",str1);
        model.addAttribute("daonguoc",daonguoc.reverse());
        return "bai2";
    }

}
