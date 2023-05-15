package controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Detailsdao;
import dto.details;

@WebServlet("/fetchid")
public class Fetchid extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Detailsdao d=new Detailsdao();
		details det=d.find(Integer.parseInt(req.getParameter("id")));
		if(det==null)
		{
			resp.getWriter().print("<h1>No data Found with the id</h1>");
		}
		else
		{
		List<details> list= new ArrayList<details>();
		list.add(det);
		req.setAttribute("list", list);
		req.getRequestDispatcher("fetchall.jsp").forward(req, resp);
	}

	}
}