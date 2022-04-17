package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ListaEmpresaServlet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresaServlet extends HttpServlet { 
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    Banco banco = new Banco();
    List<Empresa> lista = banco.getEmpresas();

    request.setAttribute("empresas", lista);

    RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
    rd.forward(request,response);
	}

}

