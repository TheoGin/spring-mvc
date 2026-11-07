package org.example.web.viewresolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component(value = "myViewx")
public class MyView extends AbstractView {
    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("进入到自己的 MyView 视图解析器");

        request.getRequestDispatcher("/WEB-INF/pages/my_view.jsp").forward(request, response);
    }
}
