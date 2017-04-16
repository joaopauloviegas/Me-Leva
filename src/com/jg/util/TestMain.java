package com.jg.util;

import com.jg.entidades.Usuario;
import com.jg.repositorio.RepositorioUsuario;

public class TestMain {

	public static void main(String[] args) {
		RepositorioUsuario ru = new RepositorioUsuario();
		Usuario usuario = new Usuario("Xupla","gabriel.goncalves@hotmail.com","goncalves","06958005406","Trav PauBrasil","Nao tem",38,"Kennedy","PE",10);
		ru.cadastrarUsuario(usuario);
		
	}

}
