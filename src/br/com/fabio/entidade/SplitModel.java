package br.com.fabio.entidade;

import java.util.List;

public class SplitModel {

	/// Obrigat�rio: Caso algum erro acontece a opera��o de gerar boleto e cancelada

	public boolean AbortarEmCasoDeErro;
	public List<SplitCliente> Clientes;

	public boolean isAbortarEmCasoDeErro() {
		return AbortarEmCasoDeErro;
	}

	public void setAbortarEmCasoDeErro(boolean abortarEmCasoDeErro) {
		AbortarEmCasoDeErro = abortarEmCasoDeErro;
	}

	public List<SplitCliente> getClientes() {
		return Clientes;
	}

	public void setClientes(List<SplitCliente> clientes) {
		Clientes = clientes;
	}

}