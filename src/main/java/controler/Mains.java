package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Detailsdao;
import dto.details;

@WebServlet("/insert")
public class Mains extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	 String name=req.getParameter("name");
//	 String Email=req.getParameter("email");
     long mobile=Long.parseLong(req.getParameter("mobile"));
	
	 details d=new details();
	 d.setName(req.getParameter("name"));
	 d.setEmailid(req.getParameter("email"));
	 d.setMobile(mobile);
	 
	 Detailsdao dao=new Detailsdao();
	 dao.save(d);
	 
	 
	 
}
}
