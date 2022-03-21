package project.firstServlet.web.frontcontroller.v2.controller;

import project.firstServlet.web.frontcontroller.MyView;
import project.firstServlet.web.frontcontroller.v1.ControllerV1;
import project.firstServlet.web.frontcontroller.v2.ControllerV2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberFormControllerV2 implements ControllerV2 {
    @Override
    public MyView process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return new MyView("/WEB-INF/views/new-form.jsp");
    }
}
