package br.com.fabio.entidade;

public class Cliente {

	/// Obrigatório: Nome do sacado.

	public String NomeRazao;

	/// Obrigatório: Cpf ou Cnpj do sacado.

	public String CpfCnpj;

	/// Obrigatório: E-mail válido do sacado.

	public String Email;

	/// Opcional: Sexo do sacado em caso de pessoa física.

	public String Sexo;

	/// Opcional: Data de nascimento do sacado no caso de pessoa física.

	public String DataDeNascimento;

	/// Opcional: Número de celular do sacado.

	public String Celular;

	/// Obrigatório: Apelido identificador para o endereço do sacado. Ex.: Casa

	public String ApelidoEndereco;

	/// Obrigatório: Cep do endereço do sacado. É necessário informar um cep válido.

	public String CEP;

	/// Obrigatório: Logradouro do sacado. Ex.: Av

	public String Logradouro;

	/// Obrigatório: Endereço do sacado

	public String Endereco;

	/// Obrigatório: Bairro do endereço sacado.

	public String Bairro;

	/// Obrigatório: Número do endereço do sacado.

	public String Numero;

	/// Obrigatório: Complemento do endereço do sacado.

	public String Complemento;

	/// Obrigatório: Cidade do endereço do sacado.

	public String Cidade;

	/// Obrigatório: Estado do endereço do sacado. Ex.: SP

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