package project.firstServlet.web.frontcontroller.v3;

import project.firstServlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
