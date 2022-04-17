package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

//anota��o
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{

		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Ol� Mundo, voc� escreveu seu primeiro Servlet!");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Servlet foi chamado no TomCat, Servlet Funcionou!");
	}
}
