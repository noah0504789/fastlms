package com.zerobase.fastlms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainPage {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String msg = "hello";

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = response.getWriter();

        printWriter.write(msg);
        printWriter.close();

    }
}
