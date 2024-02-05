package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * create on 2024/02/02.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    String name = request.getParameter("name");
    System.out.println("Hello servlet service!!" + name);

    response.setContentType("text/plain");
    response.setCharacterEncoding("utf-8");

    response.getWriter().write("name is : " + name);
  }
}
