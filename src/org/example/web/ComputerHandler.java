package org.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/computer")
public class ComputerHandler {
    @RequestMapping(value = "/info", method = RequestMethod.POST, params = {"brand", "price", "nums"})
    public String info(String brand, double price, int nums) {
        System.out.println("品牌：" + brand + " 价格：" + price + " 数量：" + nums);
        return "info";
    }
}
