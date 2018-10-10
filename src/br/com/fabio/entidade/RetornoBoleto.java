package br.com.fabio.entidade;

import java.util.List;

public class RetornoBoleto {

	public List<String> requisicao;
	public String paginacao;
	public APIBoleto resultado;

	public List<String> getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(List<String> requisicao) {
		this.requisicao = requisicao;
	}

	public String getPaginacao() {
		return paginacao;
	}

	public void setPaginacao(String paginacao) {
		this.paginacao = paginacao;
	}

	public APIBoleto getResultado() {
		return resultado;
	}

	public void setResultado(APIBoleto resultado) {
		this.resultado = resultado;
	}

}
