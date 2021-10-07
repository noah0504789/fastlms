package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.repository.MemberRepository;
import com.zerobase.fastlms.member.service.Impl.MemberServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@AllArgsConstructor
public class MemberController {

    private final MemberServiceImpl memberService;

    @GetMapping(value = "/member/register")
    public String register() {
        return "member/register";
    }

    @PostMapping(value = "/member/register")
    public String registerSubmit(Model model, HttpServletRequest request, HttpServletResponse response, MemberInput parameter) {

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complate";
    }

    @GetMapping("/member/email-auth")
    public String emailAuth(HttpServletRequest request, Model model) {
        String uuid = request.getParameter("id");

        boolean result = memberService.emailAuth(uuid);
        model.addAttribute("result", result);

        return "member/email_auth";
    }

}
