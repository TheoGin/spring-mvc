package org.example.web.viewresolver.pratice;

import org.example.web.viewresolver.pratice.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class LoginHandler {

    @RequestMapping("/login")
    public String doLogin(User user, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("========登录 login===========");

        // 默认会把 user 对象放在 request 域中
        // request.setAttribute("username", user.getUsername());
        // request.setAttribute("password", user.getPassword());

        if("sopho".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            return "forward:/WEB-INF/pages/login_ok.jsp";
        }
        return "forward:/WEB-INF/pages/login_error.jsp";
    }
    /* @RequestMapping("/login")
    public ModelAndView doLogin(User user, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("========登录 login===========");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", user.getUsername());
        modelAndView.addObject("password", user.getPassword());

        if ("sopho".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            modelAndView.setViewName("login_ok");
        } else {
            modelAndView.setViewName("login_error");
        }

        return modelAndView;
    } */
}
