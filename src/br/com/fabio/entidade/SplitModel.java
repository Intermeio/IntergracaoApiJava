package br.com.fabio.entidade;

import java.util.List;

public class SplitModel {

	/// Obrigatório: Caso algum erro acontece a operação de gerar boleto e cancelada

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