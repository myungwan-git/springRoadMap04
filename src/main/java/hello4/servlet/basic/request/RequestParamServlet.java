package hello4.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    System.out.println("전체 파라미터 조회 Start !!! ");

    Enumeration<String> parameterNames= request.getParameterNames();
    while (parameterNames.hasMoreElements()) {
      String paramName = parameterNames.nextElement();
      System.out.println(paramName + "=" + request.getParameter(paramName));
    }

    System.out.println();

    System.out.println("이름이 같은 파라미터 조회 @@@");
    String[] names = request.getParameterValues("username");
    for (String name : names) {
      System.out.println("name = " + name);
    }
  }
}
