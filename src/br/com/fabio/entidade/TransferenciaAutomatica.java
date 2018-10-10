package br.com.fabio.entidade;

public class TransferenciaAutomatica
{
    
    /// Obrigatório: True para habilitar a tef automática e false para desabilitar. Caso não informe esse objeto o default e FALSE
    
    public boolean EfetuarTefAutomatica;
    
    /// Obrigatório: True para transferir a cobrança da tarifa para o participante do split e False para cobrar a tarifa do emissor.
    
    public boolean ACobrar;
    
    /// Obrigatório: Indica a periodicidade tef's automáticas para o cliente participante do split. 1 - Todo 1º dia útil do mês; 2 - Todo 1º dia útil da semana; 3 - Diariamente;
    
    public int Periodicidade;
    
    /// Obrigatório: Indica valor mínimo para as tef's automáticas serem efetuadas ao participante do split
    
    public String ValorMinimo;

	public boolean isEfetuarTefAutomatica() {
		return EfetuarTefAutomatica;
	}

	public void setEfetuarTefAutomatica(boolean efetuarTefAutomatica) {
		EfetuarTefAutomatica = efetuarTefAutomatica;
	}

	public boolean isACobrar() {
		return ACobrar;
	}

	public void setACobrar(boolean aCobrar) {
		ACobrar = aCobrar;
	}

	public int getPeriodicidade() {
		return Periodicidade;
	}

	public void setPeriodicidade(int periodicidade) {
		Periodicidade = periodicidade;
	}

	public String getValorMinimo() {
		return ValorMinimo;
	}

	public void setValorMinimo(String valorMinimo) {
		ValorMinimo = valorMinimo;
	}
    
    
}
