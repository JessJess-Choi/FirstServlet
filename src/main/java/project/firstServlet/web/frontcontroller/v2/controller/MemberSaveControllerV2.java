package project.firstServlet.web.frontcontroller.v2.controller;

import project.firstServlet.domain.member.Member;
import project.firstServlet.domain.member.MemberRepository;
import project.firstServlet.web.frontcontroller.MyView;
import project.firstServlet.web.frontcontroller.v1.ControllerV1;
import project.firstServlet.web.frontcontroller.v2.ControllerV2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        int age = Integer.parseInt(req.getParameter("age"));

        Member member = new Member(username,age);
        memberRepository.save(member);

        req.setAttribute("member",member);

        return new MyView("/WEB_INF/views/save-result.jsp");
    }
}
