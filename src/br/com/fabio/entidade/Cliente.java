package br.com.fabio.entidade;

public class Cliente {

	/// Obrigat�rio: Nome do sacado.

	public String NomeRazao;

	/// Obrigat�rio: Cpf ou Cnpj do sacado.

	public String CpfCnpj;

	/// Obrigat�rio: E-mail v�lido do sacado.

	public String Email;

	/// Opcional: Sexo do sacado em caso de pessoa f�sica.

	public String Sexo;

	/// Opcional: Data de nascimento do sacado no caso de pessoa f�sica.

	public String DataDeNascimento;

	/// Opcional: N�mero de celular do sacado.

	public String Celular;

	/// Obrigat�rio: Apelido identificador para o endere�o do sacado. Ex.: Casa

	public String ApelidoEndereco;

	/// Obrigat�rio: Cep do endere�o do sacado. � necess�rio informar um cep v�lido.

	public String CEP;

	/// Obrigat�rio: Logradouro do sacado. Ex.: Av

	public String Logradouro;

	/// Obrigat�rio: Endere�o do sacado

	public String Endereco;

	/// Obrigat�rio: Bairro do endere�o sacado.

	public String Bairro;

	/// Obrigat�rio: N�mero do endere�o do sacado.

	public String Numero;

	/// Obrigat�rio: Complemento do endere�o do sacado.

	public String Complemento;

	/// Obrigat�rio: Cidade do endere�o do sacado.

	public String Cidade;

	/// Obrigat�rio: Estado do endere�o do sacado. Ex.: SP

	public String Estado;

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

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getDataDeNascimento() {
		return DataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getApelidoEndereco() {
		return ApelidoEndereco;
	}

	public void setApelidoEndereco(String apelidoEndereco) {
		ApelidoEndereco = apelidoEndereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}