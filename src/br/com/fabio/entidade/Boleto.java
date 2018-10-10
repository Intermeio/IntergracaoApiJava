package br.com.fabio.entidade;

public class Boleto {

	/// Obrigat�rio: Identificador do requisitante.

	public String Valor;

	/// Obrigat�rio: Contra-chave do requisitante.

	public String DataVencimento;

	/// Obrigat�rio: Identificador �nico do cliente em sistema pr�prio.

	public String NumeroDocumento;

	/// Opicional: Porcentagem de juros ao mes, aplicado ao valor do boleto.
	/// Formato: "10,23". M�ximo de: 40%

	public String PercentualJuros;

	/// Opicional: Valor em R$ de juros ao dia, aplicado ao valor do boleto.
	/// Formato: "0023" = R$ 0,23. Os dois �ltimos n�meros representam a casa
	/// decimal.

	public int ValorJuros;

	/// Opicional: Quantidade de dias ap�s o vencimento que se iniciar� o c�lculo
	/// dos juros.

	public int QntDiasJuros;

	/// Opicional: Porcentagem de multa ao mes, aplicado ao valor do boleto.
	/// Formato: "10,23". M�ximo de: 40%

	public String PercentualMulta;

	/// Opicional: Valor em R$ de multa ap�s o vencimento do titulo, aplicado ao
	/// valor do boleto. Formato: "0023" = R$ 0,23. Os dois �ltimos n�meros
	/// representam a casa decimal.

	public int ValorMulta;

	/// Opicional: Quantidade de dias ap�s o vencimento que se iniciar� o c�lculo da
	/// multa.

	public int QntDiasMulta;

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public String getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public String getNumeroDocumento() {
		return NumeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}

	public String getPercentualJuros() {
		return PercentualJuros;
	}

	public void setPercentualJuros(String percentualJuros) {
		PercentualJuros = percentualJuros;
	}

	public int getValorJuros() {
		return ValorJuros;
	}

	public void setValorJuros(int valorJuros) {
		ValorJuros = valorJuros;
	}

	public int getQntDiasJuros() {
		return QntDiasJuros;
	}

	public void setQntDiasJuros(int qntDiasJuros) {
		QntDiasJuros = qntDiasJuros;
	}

	public String getPercentualMulta() {
		return PercentualMulta;
	}

	public void setPercentualMulta(String percentualMulta) {
		PercentualMulta = percentualMulta;
	}

	public int getValorMulta() {
		return ValorMulta;
	}

	public void setValorMulta(int valorMulta) {
		ValorMulta = valorMulta;
	}

	public int getQntDiasMulta() {
		return QntDiasMulta;
	}

	public void setQntDiasMulta(int qntDiasMulta) {
		QntDiasMulta = qntDiasMulta;
	}
	
	

}
