package org.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 这个还要保留！！！
@RequestMapping(value = "/user")
public class UserHandler {
    @RequestMapping(value = "/buy", method = RequestMethod.POST, params = {"username", "nums"})
    public String buy(String username, int nums) {
        System.out.println("购买商品：" + username + " " + nums);
        return "success";
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, params = {"bookId!=100"})
    public String search(String bookId) {
        System.out.println("查询商品：" + bookId);
        return "success";
    }

    @RequestMapping(value = "/reg/**", method = RequestMethod.GET)
    public String reg() {
        System.out.println("占位符的演示 ");
        return "success";
    }

    @RequestMapping(value = "/reg/{username}/{age}", method = RequestMethod.GET)
    public String reg(@PathVariable String username, @PathVariable int age) {
        System.out.println("reg: " + username + " " + age);
        return "success";
    }
}
