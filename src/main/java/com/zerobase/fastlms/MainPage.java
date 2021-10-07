package com.zerobase.fastlms;

import com.zerobase.fastlms.component.MailComponent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@AllArgsConstructor
public class MainPage {

    private final MailComponent mailComponent;

    @RequestMapping("/")
    public String index() {

//        String email = "noah0504@naver.com";
//        String subject = " 안녕하세요. 제로베이스입니다. ";
//        String text = "<p>안녕하세요. </p> <p>반갑습니다.</p>";
//
//        mailComponent.sendMail(email, subject, text);
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
