package hello4.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("HelloServlet.service");

    System.out.println("request = " + request.getParameter("username"));
    String name = request.getParameter("username");
    System.out.println("response = " + response);

    response.setContentType("AAAAAAA");
    response.setCharacterEncoding("utf-8");
    response.getWriter().write("hello " + name + " hoo .... ");

  }
}
