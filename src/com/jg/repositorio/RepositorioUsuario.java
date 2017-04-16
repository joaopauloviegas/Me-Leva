package com.jg.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jg.entidades.Usuario;
import com.jg.util.Conexao;

public class RepositorioUsuario {
	
	Connection con = Conexao.getConnection();
	
	public void cadastrarUsuario(Usuario usuario){
		
		String sql = "INSERT INTO usuario(nome,email,password,cpf,logradouro,complemento,numero,bairro,uf,xp)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getPassword());
			ps.setString(4, usuario.getCpf());
			ps.setString(5, usuario.getLogradouro());
			ps.setString(6, usuario.getComplemento());
			ps.setInt(7, usuario.getNumero());
			ps.setString(8, usuario.getBairro());
			ps.setString(9, usuario.getUf());
			ps.setInt(10, usuario.getXp());
			ps.execute();
			ps.close();
			
			System.out.println("Cadastrado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	
		
	}

}
