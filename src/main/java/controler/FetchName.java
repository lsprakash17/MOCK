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

@WebServlet("/fetchname")
public class FetchName extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Detailsdao dao = new Detailsdao();
		String name = req.getParameter("name");
		int id = 0;
//			List<details> list= new ArrayList<details>();
//			list.add(l);
		List<details> fetchall = dao.Fetchall();
		for (details d : fetchall) {
			if (d.getName().equals(name)) {
				id = d.getId();
			}
		}
		details details = dao.find(id);
		List<details> list = new ArrayList();
		list.add(details);
		req.setAttribute("list", list);
		req.getRequestDispatcher("fetchall.jsp").forward(req, resp);
	}

}
