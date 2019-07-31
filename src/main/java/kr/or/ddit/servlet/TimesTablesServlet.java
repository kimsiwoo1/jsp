package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TimesTablesServlet extends HttpServlet{
	private Logger logger = LoggerFactory.getLogger(TimesTablesServlet.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		logger.debug("TimesTablesServlet doGet(){} {}", method, method+"test");
		logger.trace("trace TimesTablesServlet doGet()");
		logger.info("info TimesTablesServlet doGet()");
		logger.warn("warn TimesTablesServlet doGet()");
		logger.error("error TimesTablesServlet doGet()");
		resp.setContentType("text/html; charset=UTF-8"); //타입
		
		PrintWriter pw = resp.getWriter(); //printWriter을 리턴함
		pw.write("<html>");
		pw.write("	<head>");
		pw.write("		<title>TimesTablesServlet</title>");
		pw.write("<style>");
		pw.write("table{");
		pw.write("border-collapse : collapse;");
		pw.write("}");
		pw.write("td{");
		pw.write("padding : 20px;");
		pw.write("background : #efefef;");
		pw.write("margin : 20px;");
		pw.write("}");
		pw.write("</style>");
		pw.write("	</head>");
		pw.write("	<body>");
		pw.write("      <table border='1'>");
		for(int i=1; i<10; i++) {
			pw.write("		<tr>");
			for(int j=2; j<10; j++) {
				pw.write("			<td>");
				pw.write(j+" * "+i+" = "+j*i);
				pw.write("			</td>");
			}
			pw.write("		</tr>");
		}
		pw.write("      </table>");
		pw.write("	</body>");
		pw.write("</html>");
	}
	
	
}
