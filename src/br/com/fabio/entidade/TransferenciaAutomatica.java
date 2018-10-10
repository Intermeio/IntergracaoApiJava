package br.com.fabio.entidade;

public class TransferenciaAutomatica
{
    
    /// Obrigat�rio: True para habilitar a tef autom�tica e false para desabilitar. Caso n�o informe esse objeto o default e FALSE
    
    public boolean EfetuarTefAutomatica;
    
    /// Obrigat�rio: True para transferir a cobran�a da tarifa para o participante do split e False para cobrar a tarifa do emissor.
    
    public boolean ACobrar;
    
    /// Obrigat�rio: Indica a periodicidade tef's autom�ticas para o cliente participante do split. 1 - Todo 1� dia �til do m�s; 2 - Todo 1� dia �til da semana; 3 - Diariamente;
    
    public int Periodicidade;
    
    /// Obrigat�rio: Indica valor m�nimo para as tef's autom�ticas serem efetuadas ao participante do split
    
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
