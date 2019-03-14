package com.zqr.delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispacher(req,resp);
    }
    private void doDispacher(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        String id = req.getParameter("id");
        String rst;
        if(uri.equals("/loginIn.json")){
            rst = new SystemCointroller().loginIn();
        }else if (uri.equals("/getUserById.json")){
            rst = new UserController().getUserById(id);
        }else if (uri.equals("/getOrderById.json")){
            rst = new OrderController().getOrderById(id);
        }else{
            rst = new SystemCointroller().loginOut();
        }
        try {
            //让浏览器用utf8来解析返回的数据
            resp.setHeader("Content-type", "text/html;charset=UTF-8");
            //告诉servlet用UTF-8转码，而不是用默认的ISO8859
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write(rst);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
