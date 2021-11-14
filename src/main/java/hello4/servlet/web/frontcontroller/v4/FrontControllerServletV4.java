package hello4.servlet.web.frontcontroller.v4;

import hello4.servlet.web.frontcontroller.v4.controller.MemberFormControllerV4;
import hello4.servlet.web.frontcontroller.v4.controller.MemberListControllerV4;
import hello4.servlet.web.frontcontroller.v4.controller.MemberSaveControllerV4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServletV4", urlPatterns = "/front-controller/v4/*")
public class FrontControllerServletV4 extends HttpServlet {

  private Map<String, ControllerV4> controllerMap = new HashMap<>();

  public FrontControllerServletV4() {
    controllerMap.put("/front-controller/v4/members/new-form", new MemberFormControllerV4());
    controllerMap.put("/front-controller/v4/members/save", new MemberSaveControllerV4());
    controllerMap.put("/front-controller/v4/members", new MemberListControllerV4());

  }

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String requestURI = request.getRequestURI();

  }
}
