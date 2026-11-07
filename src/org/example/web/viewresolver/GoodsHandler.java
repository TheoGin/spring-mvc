package org.example.web.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsHandler {

    @RequestMapping("/buy")
    public String buy() {
        System.out.println("========购买商品 buy===========");

        return "myView";
    }
}
