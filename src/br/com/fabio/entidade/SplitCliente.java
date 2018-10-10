package br.com.fabio.entidade;

import java.util.List;

public class SplitCliente
{
    
    /// Obrigatório: Nome do sacado
    
    public String NomeRazao;
    
    /// Obrigatório: Documento do participante do split
    
    public String CpfCnpj;
    
    /// Obrigatório: Email do participante do split
    
    public String Email;
    
    /// Obrigatório: Porcentagem que o cliente split deverá receber encima do valor da cobrança
    
    public String Taxa;
    
    /// Opcional: Porcentagem que o cliente split deverá receber encima do valor da cobrança
    
    public String Descricao;
    
    /// Obrigatório: Caso queira notificar por SMS ao participante do split sobre a quantia recebida. O SMS só será enviado caso a cobrança seja paga. As tarifas de envio serão cobradas do emissor da cobrança.
    
    public boolean NotificarPorSms;
    
    /// Obrigatório: Caso queira notificar por e-mail ao participante do split sobre a quantia recebida. O e-mail só será enviado caso a cobrança seja paga. As tarifas de envio serão cobradas do emissor da cobrança.
    
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
