package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Detailsdao;
import dto.details;

@WebServlet("/fetchall")
public class fetchall extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		   Detailsdao dao=new Detailsdao();
		   List<details> list=dao.Fetchall();
		   req.setAttribute("list", list);
		   req.getRequestDispatcher("fetchall.jsp").include(req, resp);
	}

}
