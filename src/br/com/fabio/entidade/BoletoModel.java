package br.com.fabio.entidade;

public class BoletoModel {

	public Boleto Boleto;
	public Cliente Cliente;
	public SplitModel Split;
	public Configuracoes Configuracoes;

	public Boleto getBoleto() {
		return Boleto;
	}

	public void setBoleto(Boleto boleto) {
		Boleto = boleto;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public SplitModel getSplit() {
		return Split;
	}

	public void setSplit(SplitModel split) {
		Split = split;
	}

	public Configuracoes getConfiguracoes() {
		return Configuracoes;
	}

	public void setConfiguracoes(Configuracoes configuracoes) {
		Configuracoes = configuracoes;
	}

}
