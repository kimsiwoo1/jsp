package kr.or.ddit.user.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class UserFormController
 */
@WebServlet("/userForm")
public class UserFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(UserFormController.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/user/userForm.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userNm = request.getParameter("userNm");
		String alias = request.getParameter("alias");
		String reg_dt = request.getParameter("reg_dt");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String zipcode = request.getParameter("zipcode");
		String pass = request.getParameter("pass");
		
		logger.debug("user parameter : {}, {}, {}, {}, {}, {}, {}, {}", userId, userNm, alias, reg_dt, addr1, addr2, zipcode, pass);
	}

}
