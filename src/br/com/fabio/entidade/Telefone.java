package br.com.fabio.entidade;

public class Telefone
{
    
    /// Obrigat�rio: Apelido para o telefone informado, exemplo:(Comercial / Celular)
    
    public String Apelido;
    
    /// Obrigat�rio: DDD para o n�mero informado
    
    public String DDD;
    
    /// Obrigat�rio: N�mero do telefone
    
    public String Numero;

	public String getApelido() {
		return Apelido;
	}

	public void setApelido(String apelido) {
		Apelido = apelido;
	}

	public String getDDD() {
		return DDD;
	}

	public void setDDD(String dDD) {
		DDD = dDD;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}
    
}