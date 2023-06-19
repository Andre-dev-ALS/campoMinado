package modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	private final int linha;
	private final int coluna;
	private boolean minado = false;
	private boolean aberto = false;
	private List<Campo> vizinhos;

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		vizinhos = new ArrayList<>();
	}

}