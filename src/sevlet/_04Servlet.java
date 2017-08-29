package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.UserVo;

@WebServlet("/04")
public class _04Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserVo vo2 = new UserVo();
		vo2.setNo(20L);
		vo2.setEmail("2twin10240@naver.com");
		
		UserVo vo3 = new UserVo();
		vo3.setNo(30L);
		vo3.setEmail("3twin10240@naver.com");
		
		UserVo vo4 = new UserVo();
		vo4.setNo(40L);
		vo4.setEmail("4twin10240@naver.com");
		
		// Request Scope
		request.setAttribute("userVo2", vo2);
		
		// Session Scope
		request.getSession(true).setAttribute("userVo3", vo3);
		
		// Application Scope
		request.getServletContext().setAttribute("userVo4", vo4);
		
		
		request.getRequestDispatcher( "/view/04.jsp" ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}
}
