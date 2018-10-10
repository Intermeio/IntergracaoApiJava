package br.com.fabio.entidade;

import java.util.List;

public class RetornoToken {

	public List<String> requisicao;
	public String paginacao;
	public APIToken resultado;

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

	public APIToken getResultado() {
		return resultado;
	}

	public void setResultado(APIToken resultado) {
		this.resultado = resultado;
	}

}
