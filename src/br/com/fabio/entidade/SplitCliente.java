package br.com.fabio.entidade;

import java.util.List;

public class SplitCliente
{
    
    /// Obrigat�rio: Nome do sacado
    
    public String NomeRazao;
    
    /// Obrigat�rio: Documento do participante do split
    
    public String CpfCnpj;
    
    /// Obrigat�rio: Email do participante do split
    
    public String Email;
    
    /// Obrigat�rio: Porcentagem que o cliente split dever� receber encima do valor da cobran�a
    
    public String Taxa;
    
    /// Opcional: Porcentagem que o cliente split dever� receber encima do valor da cobran�a
    
    public String Descricao;
    
    /// Obrigat�rio: Caso queira notificar por SMS ao participante do split sobre a quantia recebida. O SMS s� ser� enviado caso a cobran�a seja paga. As tarifas de envio ser�o cobradas do emissor da cobran�a.
    
    public boolean NotificarPorSms;
    
    /// Obrigat�rio: Caso queira notificar por e-mail ao participante do split sobre a quantia recebida. O e-mail s� ser� enviado caso a cobran�a seja paga. As tarifas de envio ser�o cobradas do emissor da cobran�a.
    
    public boolean NotificarPorEmail;

    public List<Telefone> Telefones;

    public ClienteContaBancaria ClienteContaBancaria;

    public TransferenciaAutomatica TransferenciaAutomatica;

	public String getNomeRazao() {
		return NomeRazao;
	}

	public void setNomeRazao(String nomeRazao) {
		NomeRazao = nomeRazao;
	}

	public String getCpfCnpj() {
		return CpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		CpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTaxa() {
		return Taxa;
	}

	public void setTaxa(String taxa) {
		Taxa = taxa;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public boolean isNotificarPorSms() {
		return NotificarPorSms;
	}

	public void setNotificarPorSms(boolean notificarPorSms) {
		NotificarPorSms = notificarPorSms;
	}

	public boolean isNotificarPorEmail() {
		return NotificarPorEmail;
	}

	public void setNotificarPorEmail(boolean notificarPorEmail) {
		NotificarPorEmail = notificarPorEmail;
	}

	public List<Telefone> getTelefones() {
		return Telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		Telefones = telefones;
	}

	public ClienteContaBancaria getClienteContaBancaria() {
		return ClienteContaBancaria;
	}

	public void setClienteContaBancaria(ClienteContaBancaria clienteContaBancaria) {
		ClienteContaBancaria = clienteContaBancaria;
	}

	public TransferenciaAutomatica getTransferenciaAutomatica() {
		return TransferenciaAutomatica;
	}

	public void setTransferenciaAutomatica(TransferenciaAutomatica transferenciaAutomatica) {
		TransferenciaAutomatica = transferenciaAutomatica;
	}
    
    

}
