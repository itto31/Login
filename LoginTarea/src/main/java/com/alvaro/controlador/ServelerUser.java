package com.alvaro.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alvaro.DAO.tbUsuarioDao;
import com.alvaro.modelo.TbUsuario;

/**
 * Servlet implementation class ServelerUser
 */
public class ServelerUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServelerUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usu = request.getParameter("Usuario");
		String contra = request.getParameter("contra");
		
		TbUsuario usua = new TbUsuario();
		tbUsuarioDao usuDao = new tbUsuarioDao();
		
		usua.setUsuario(usu);
		usua.setContrasena(contra);
		
		usuDao.ListaUsuarios(usua);
		
		int verificarusuario = usuDao.ListaUsuarios(usua).size();
		if(verificarusuario == 1) {
			System.out.println("Entrastes");
		}
		else {
			System.out.println("Nel no funciono");
		}
	response.sendRedirect("index.jsp");
	}

	}


