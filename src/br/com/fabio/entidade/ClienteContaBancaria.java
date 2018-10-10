package br.com.fabio.entidade;

public class ClienteContaBancaria
{
    
    /// Obrigátorio: Código do banco a que pertence a conta
    
    public String CodigoBanco;
    
    /// Obrigatório: Número da agência
    
    public String Agencia;
    
    /// Obrigatório: Dígito da agência
    
    public String DigAgencia;
    
    /// Obrigatório: Número da conta
    
    public String Conta;
    
    /// Obrigatório: Dígito da conta
    
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