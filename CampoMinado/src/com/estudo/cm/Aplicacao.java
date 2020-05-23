package com.estudo.cm;

import com.estudo.cm.modelo.Tabuleiro;
import com.estudo.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}

}
