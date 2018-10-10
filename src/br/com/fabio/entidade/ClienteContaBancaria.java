package br.com.fabio.entidade;

public class ClienteContaBancaria
{
    
    /// Obrig�torio: C�digo do banco a que pertence a conta
    
    public String CodigoBanco;
    
    /// Obrigat�rio: N�mero da ag�ncia
    
    public String Agencia;
    
    /// Obrigat�rio: D�gito da ag�ncia
    
    public String DigAgencia;
    
    /// Obrigat�rio: N�mero da conta
    
    public String Conta;
    
    /// Obrigat�rio: D�gito da conta
    
    public String DigConta;

	public String getCodigoBanco() {
		return CodigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		CodigoBanco = codigoBanco;
	}

	public String getAgencia() {
		return Agencia;
	}

	public void setAgencia(String agencia) {
		Agencia = agencia;
	}

	public String getDigAgencia() {
		return DigAgencia;
	}

	public void setDigAgencia(String digAgencia) {
		DigAgencia = digAgencia;
	}

	public String getConta() {
		return Conta;
	}

	public void setConta(String conta) {
		Conta = conta;
	}

	public String getDigConta() {
		return DigConta;
	}

	public void setDigConta(String digConta) {
		DigConta = digConta;
	}
    
    
}