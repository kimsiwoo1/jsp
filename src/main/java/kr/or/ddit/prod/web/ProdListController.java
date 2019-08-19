package kr.or.ddit.prod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.prod.model.Prod;
import kr.or.ddit.prod.repository.IProdDao;
import kr.or.ddit.prod.repository.ProdDao;
import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.IUserDao;
import kr.or.ddit.user.repository.UserDao;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/prodList")
public class ProdListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IProdDao prodDao;
	
	
       
	@Override
	public void init() throws ServletException {
		prodDao = new ProdDao();
	}
	
	private static final Logger logger = LoggerFactory.getLogger(ProdListController.class);
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lprodGu = request.getParameter("lprodGu");
		
		logger.debug("lprodGu : {}", lprodGu);
		
		List<Prod> prod = prodDao.getProdList(lprodGu);
		
		request.setAttribute("prod", prod);
		
		request.getRequestDispatcher("/prod/prodList.jsp").forward(request, response);
		
		
	}

}
