package project.firstServlet.web.frontcontroller.v4.controller;

import project.firstServlet.domain.member.Member;
import project.firstServlet.domain.member.MemberRepository;
import project.firstServlet.web.frontcontroller.ModelView;
import project.firstServlet.web.frontcontroller.v3.ControllerV3;
import project.firstServlet.web.frontcontroller.v4.ControllerV4;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members",members);
        return "members";
    }
}
