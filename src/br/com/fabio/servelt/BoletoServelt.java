package br.com.fabio.servelt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

import org.eclipse.persistence.sessions.serializers.JSONSerializer;

import com.google.gson.Gson;

import br.com.fabio.entidade.Boleto;
import br.com.fabio.entidade.BoletoModel;
import br.com.fabio.entidade.Cliente;
import br.com.fabio.entidade.ClienteContaBancaria;
import br.com.fabio.entidade.Configuracoes;
import br.com.fabio.entidade.EmissaoDigital;
import br.com.fabio.entidade.Token;
import br.com.fabio.entidade.TransferenciaAutomatica;
import br.com.fabio.entidade.RetornoToken;
import br.com.fabio.entidade.Sms;
import br.com.fabio.entidade.SplitCliente;
import br.com.fabio.entidade.SplitModel;
import br.com.fabio.entidade.Telefone;

/**
 * Servlet implementation class BoletoServelt
 */
@WebServlet("/BoletoServelt")
public class BoletoServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoletoServelt() {
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
		String acao = request.getParameter("action").toUpperCase();
		String tokenParametro = request.getParameter("token");
		javax.ws.rs.core.Response responsePost = null;

		try {

			Client client = ClientBuilder.newClient();
			String tokenResponse = null;

			switch (acao) {
			case "BOLETO":

				tokenResponse = "Token:" + getTokenAPI().resultado.token + ", Env:dev";
				
				String token64 = "Intermeio " + DatatypeConverter.printBase64Binary(tokenResponse.getBytes());
				responsePost = client.target("https://api.intermeio.com/v3/Boleto/Gerar")
						.request(MediaType.APPLICATION_JSON_TYPE.withCharset("utf-8"))
						.header(HttpHeaders.AUTHORIZATION, token64).post(Entity.json(MontarBoleto()));

				break;
			case "BOLETOTOKEN":

				tokenResponse = "Token:" + tokenParametro + ", Env:dev";
				String base64 = "Intermeio " + DatatypeConverter.printBase64Binary(tokenResponse.getBytes());
				responsePost = client.target("https://api.intermeio.com/v3/Boleto/Gerar")
						.request(MediaType.APPLICATION_JSON_TYPE.withCharset("utf-8"))
						.header(HttpHeaders.AUTHORIZATION, base64).post(Entity.json(MontarBoleto()));

				break;
			case "BOLETOLOTE":

				break;
			default:
				break;
			}

			String result = responsePost.readEntity(String.class);

			response.getWriter().append(result);
		} catch (Exception e) {
			response.getWriter().append(e.getMessage());
		}
	}

	private RetornoToken getTokenAPI() {
		javax.ws.rs.core.Response responsePost = null;
		Client client = ClientBuilder.newClient();
		client = ClientBuilder.newClient();

		responsePost = client.target("https://api.intermeio.com/v3/Token/Gerar")
				.request(MediaType.APPLICATION_JSON_TYPE.withCharset("utf-8"))
				.header(HttpHeaders.AUTHORIZATION, TokenBase64()).post(Entity.json(new Token()));

		RetornoToken result = responsePost.readEntity(RetornoToken.class);
		return result;
	}

	private String TokenBase64() {
		String auth = "AppKey:INT67355, Signature:I60dYmrytl0WdAl2IEzmfrSnbBrfaHu6h2M76S6zXXc=, Env:dev";

		return "Intermeio " + DatatypeConverter.printBase64Binary(auth.getBytes());
	}

	// Methodo que retorna um objeto do tipo Boleto
	private BoletoModel MontarBoleto() {
		// Objeto do tipo modelo boleto onde vai conter o boleto dentro
		BoletoModel boletoModel = new BoletoModel();
		// Objeto do tipo Boleto
		Boleto boleto = new Boleto();
		// Adicionando valores no objeto Boleto
		boleto.setDataVencimento("10/10/2020");
		boleto.setNumeroDocumento("123456789");
		boleto.setPercentualJuros("0");
		boleto.setPercentualMulta("0");
		boleto.setQntDiasJuros(0);
		boleto.setQntDiasMulta(0);
		boleto.setValor("144");
		boleto.setValorJuros(0);
		boleto.setValorMulta(0);
		// Adicionando dados do boleto ao objeto boleto model
		boletoModel.Boleto = boleto;

		// Obejto cliente que vai dentro do boleto
		Cliente cliente = new Cliente();
		// Populando o objeto cliente que vai dentro do boleto
		cliente.setNomeRazao(UUID.randomUUID().toString());
		cliente.setApelidoEndereco("endereco 01");
		cliente.setBairro("Tatuape");
		cliente.setCelular("11949544145");
		cliente.setCEP("03633020");
		cliente.setCidade("Sao Paulo");
		cliente.setComplemento("Casa");
		cliente.setCpfCnpj("43122377861");
		cliente.setDataDeNascimento("27/02/1987");
		cliente.setEmail("jose@gmail.com");
		cliente.setEndereco("Francisco Gonzales");
		cliente.setEstado("SP");
		cliente.setLogradouro("Rua");
		cliente.setSexo("M");
		cliente.setNumero("94");
		// Adicionando cliente ao objeto boleto
		boletoModel.Cliente = cliente;

		// Criando objeto do tipo Split
		SplitModel split = new SplitModel();
		// Campo importante para caso houver algum erro na transação a operação seja
		// cancelada
		split.setAbortarEmCasoDeErro(true);
		// Gerar uma lista de split para o modelo do boleto
		List<SplitCliente> listaSplit = new ArrayList<SplitCliente>();
		// Criando um objeto cliente split
		SplitCliente clientSplit = new SplitCliente();
		clientSplit.setNomeRazao("Fabio Santos");
		clientSplit.setCpfCnpj("84163307000101");
		clientSplit.setDescricao("teste");
		clientSplit.setEmail("fabio.g@inttecnologia.com.br");
		clientSplit.setTaxa("16");
		clientSplit.setNotificarPorEmail(true);
		clientSplit.setNotificarPorSms(false);

		// Criando uma lista de telefone para adicionar ao cliente do split
		List<Telefone> telefonesSplit = new ArrayList<Telefone>();
		// Criando um objeto do tipo telefone para adicionar a lista de telefone do
		// cliente split
		Telefone telefone = new Telefone();
		telefone.setApelido("Fabio");
		telefone.setDDD("11");
		telefone.setNumero("998789223");
		// Adicionando o telefone a lista
		telefonesSplit.add(telefone);
		// Adicionando a lista de telefone ao cliente
		clientSplit.setTelefones(telefonesSplit);

		// Criando um objeto do tipo conta bancaria do cliente Split
		ClienteContaBancaria clienteContaBancaria = new ClienteContaBancaria();
		clienteContaBancaria.setConta("11111");
		clienteContaBancaria.setDigConta("1");
		clienteContaBancaria.setAgencia("2222");
		clienteContaBancaria.setDigAgencia("2");
		clienteContaBancaria.setCodigoBanco("12345");
		// Adicionando a Conta Bancaria do cliente Split
		clientSplit.setClienteContaBancaria(clienteContaBancaria);

		// Criando objeto transferencia Automatica do cliente do Split
		TransferenciaAutomatica transferenciaAutomatica = new TransferenciaAutomatica();
		transferenciaAutomatica.setACobrar(true);
		transferenciaAutomatica.setEfetuarTefAutomatica(true);
		transferenciaAutomatica.setPeriodicidade(1);
		transferenciaAutomatica.setValorMinimo("100");
		// Adicionando transferencia automatica do cliente split
		clientSplit.setTransferenciaAutomatica(transferenciaAutomatica);

		// Adicionando o primeiro cliente do split neste exemplo
		listaSplit.add(clientSplit);

		/*
		// Criando um objeto cliente split 2
		SplitCliente clientSplit2 = new SplitCliente();
		clientSplit2.setNomeRazao("Fulano da Silva");
		clientSplit2.setCpfCnpj("21418476000117");
		clientSplit2.setDescricao("teste");
		clientSplit2.setEmail("Fulano@teste.com.br");
		clientSplit2.setTaxa("20");
		clientSplit2.setNotificarPorEmail(true);
		clientSplit2.setNotificarPorSms(true);

		// Utilizando a mesma lista de telefone do cliente 1 porem limpando os registro
		telefonesSplit = new ArrayList<Telefone>();
		telefone = new Telefone();
		telefone.setApelido("Split 2");
		telefone.setDDD("11");
		telefone.setNumero("998789223");
		// Adicionado o telefone do segundo cliente do split na lista
		telefonesSplit.add(telefone);
		// Adicionando a lista de telefones ao cliente split 2
		clientSplit2.Telefones = telefonesSplit;

		// Criando um novo objeto do tipo cliente conta bancaria para o segundo cliente
		// split
		clienteContaBancaria = new ClienteContaBancaria();
		clienteContaBancaria.setConta("11111");
		clienteContaBancaria.setDigConta("1");
		clienteContaBancaria.setAgencia("2222");
		clienteContaBancaria.setDigAgencia("2");
		clienteContaBancaria.setCodigoBanco("12345");
		// Adicionando a conta bancaria ao cliente split 2
		clientSplit2.setClienteContaBancaria(clienteContaBancaria);

		// Criando um novo objeto de transferencia Automatica
		transferenciaAutomatica = new TransferenciaAutomatica();
		transferenciaAutomatica.setACobrar(true);
		transferenciaAutomatica.setEfetuarTefAutomatica(true);
		transferenciaAutomatica.setPeriodicidade(1);
		transferenciaAutomatica.setValorMinimo("100");
		clientSplit2.setTransferenciaAutomatica(transferenciaAutomatica);

		// Adicionando o segundo cliente do split a lista de clientes split
		listaSplit.add(clientSplit2);*/

		// Adicionando a lista de clientes split ao objeto split
		split.Clientes = listaSplit;

		// Adicionando objeto split ao modelo do boleto
		boletoModel.Split = split;

		// Criando objeto configurações do objeto modelo
		Configuracoes configuracoes = new Configuracoes();
		// Criando objeto EmissaoDigital que fica dentro das configurações
		EmissaoDigital emissaoDigital = new EmissaoDigital();
		// Criando objeto emissão digital
		emissaoDigital.setEmail("fabio.tecnologia@live.com");
		// Criando objeto para envio de SMS que fica dentro do Emissão Digital
		Sms sms = new Sms();
		// Adicionando o numero do celular que receba a mensagem SMS
		sms.setCelular("11998789223");
		sms.setMsg("Teste Via API classe de teste");
		emissaoDigital.Sms = sms;
		// Adicionando a emissão ao objeto de configuração
		configuracoes.setEmissaoDigital(emissaoDigital);

		// Adicionando a configuração o boleto model
		boletoModel.Configuracoes = configuracoes;
       
		Gson gson = new Gson();
		
		String jsonMeu = gson.toJson(boletoModel);
		
		return boletoModel;
	}

}
