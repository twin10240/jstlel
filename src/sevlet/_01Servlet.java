package sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.UserVo;

@WebServlet( "/01" )
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iValue = 10;
		float fValue = 3.14f;
		String sValue = "Hello World";
		boolean bValue = true;
		Object nullValue = null;
		
		UserVo vo = new UserVo();
		vo.setNo(100L);
		vo.setEmail("twin10240@naver.com");
		
		request.setAttribute("iValue", iValue);
		request.setAttribute("fValue", fValue);
		request.setAttribute("sValue", sValue);
		request.setAttribute("bValue", bValue);
		request.setAttribute("nullValue", nullValue);

		request.setAttribute("UserVo", vo);
		
		request.getRequestDispatcher( "/view/01.jsp" ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}
}
