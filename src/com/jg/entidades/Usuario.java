package com.jg.entidades;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String password;
	private String cpf;
	private String logradouro;
	private String complemento;
	private int numero;
	private String bairro;
	private String uf;
	private int xp;
	
	
	public Usuario(){
		
	}
	
	
	public Usuario(int id, String nome, String email, String password,
			String cpf, String logradouro, String complemento, int numero,
			String bairro, String uf, int xp) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.uf = uf;
		this.xp = xp;
	}





	public Usuario(String nome, String email, String password, String cpf,
			String logradouro, String complemento, int numero, String bairro,
			String uf, int xp) {
		super();
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.uf = uf;
		this.xp = xp;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public int getXp() {
		return xp;
	}


	public void setXp(int xp) {
		this.xp = xp;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", password=" + password + ", cpf=" + cpf + ", logradouro="
				+ logradouro + ", complemento=" + complemento + ", numero="
				+ numero + ", bairro=" + bairro + ", uf=" + uf + ", xp=" + xp
				+ "]";
	}
	
	
	
	
	
	
	

	
	
	

}
