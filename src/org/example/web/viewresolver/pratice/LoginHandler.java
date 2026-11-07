package org.example.web.viewresolver.pratice;

import org.example.web.viewresolver.pratice.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginHandler {

    @RequestMapping("/login")
    public String doLogin(User user) {
        System.out.println("========登录 login===========");
        if("sopho".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            return "login_ok";
        }
        return "login_error";
    }
}
