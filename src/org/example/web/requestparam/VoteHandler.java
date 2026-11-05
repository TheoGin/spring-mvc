package org.example.web.requestparam;

import org.example.web.entity.Master;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/vote")
public class VoteHandler {

    @RequestMapping("/vote01")
    public String doVote(@RequestParam(value = "name", required = false) String voterName) {
        System.out.println(voterName + " voted successfully.");
        return "success";
    }

    @RequestMapping("/vote02")
    public String vote02(@RequestHeader("accept-encoding") String acceptEncoding, @RequestHeader("host") String host) {
        System.out.println("Accept-Encoding: " + acceptEncoding);
        System.out.println("Host: " + host);
        return "success";
    }

    @RequestMapping("/vote03")
    public String vote03(Master master) {
        System.out.println("主人信息：" + master);
        return "success";
    }

    @RequestMapping("/vote04")
    public String vote04(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
        System.out.println("用户名：" + req.getParameter("username"));
        System.out.println("密码：" + req.getParameter("pwd"));
        System.out.println("会话ID：" + session.getId());
        System.out.println("HttpSession: " + session); // HttpSession: org.apache.catalina.session.StandardSessionFacade@64d8c0da
        System.out.println("req.getSession(): " + req.getSession()); // req.getSession(): org.apache.catalina.session.StandardSessionFacade@64d8c0da
        return "success";
    }

    @RequestMapping("/vote05")
    public String vote05(Master master, HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("主人信息：" + master);

        // req.setAttribute("master", null); // 无效
        req.setAttribute("address", "深圳");

        return "vote_ok";
    }

    @RequestMapping("/vote06")
    public String vote06(Map<String, Object> map, Master master) {
        System.out.println("vote06 方法执行了");

        map.put("address", "北京");
        map.put("master", null);

        return "vote_ok";
    }

    @RequestMapping("/vote07")
    public ModelAndView vote07(Master master, HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("vote07 方法执行了");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address", "上海");
        modelAndView.addObject("master", null);
        modelAndView.setViewName("vote_ok");

        return modelAndView;
    }

    @RequestMapping("/vote08")
    public String vote08(Master master, HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
        System.out.println("vote08 方法执行了");
        session.setAttribute("address", "上海");
        session.setAttribute("master", master);
        return "vote_ok";
    }

    @ModelAttribute
    public void prepareModel() {
        System.out.println("@ModelAttribute 的 prepareModel 方法执行了");
    }
}
