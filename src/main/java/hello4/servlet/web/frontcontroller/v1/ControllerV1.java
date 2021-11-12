package hello4.servlet.web.frontcontroller.v1;

import org.springframework.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {

  void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
