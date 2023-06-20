package modelocampoMinado;

import org.junit.jupiter.api.BeforeEach;

import modelo.Campo;

class CampoTest {
	Campo campo;

	@BeforeEach

	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
}
