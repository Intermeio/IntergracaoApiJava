package br.com.fabio.entidade;

public class Telefone
{
    
    /// Obrigatório: Apelido para o telefone informado, exemplo:(Comercial / Celular)
    
    public String Apelido;
    
    /// Obrigatório: DDD para o número informado
    
    public String DDD;
    
    /// Obrigatório: Número do telefone
    
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