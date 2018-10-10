package br.com.fabio.servelt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.DatatypeConverter;

import br.com.fabio.entidade.Token;

/**
 * Servlet implementation class TokenServelt
 */
@WebServlet("/TokenServelt")
public class TokenServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TokenServelt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			Client client = ClientBuilder.newClient();

			client = ClientBuilder.newClient();
			Token token = new Token();
			String auth = "AppKey:INT67355, Signature:I60dYmrytl0WdAl2IEzmfrSnbBrfaHu6h2M76S6zXXc=, Env:dev";

			String base64 = "Intermeio " + DatatypeConverter.printBase64Binary(auth.getBytes());
			javax.ws.rs.core.Response responsePost = client.target("https://api.intermeio.com/v3/Token/Gerar")
					.request(MediaType.APPLICATION_JSON_TYPE.withCharset("utf-8"))
					.header(HttpHeaders.AUTHORIZATION, base64).post(Entity.json(token));

			String result = responsePost.readEntity(String.class);

			response.getWriter().append(result);
		} catch (Exception e) {
			response.getWriter().append(e.getMessage());
		}
	}

}
