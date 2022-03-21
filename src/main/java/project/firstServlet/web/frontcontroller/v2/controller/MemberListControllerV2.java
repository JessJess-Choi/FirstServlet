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
import java.util.List;

public class MemberListControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();

        req.setAttribute("members",members);

        return new MyView("/WEB-INF/views/members.jsp");
    }
}
