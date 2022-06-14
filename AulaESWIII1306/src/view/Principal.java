package view;

import controller.pontuacaoEnsinoMedio;
import model.Candidato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Candidato c = new Candidato();
	c.setId(1);
	c.setNome("Fabiano");
	c.setEnsinoMedioPublico(true);
	c.setEnsinoSuperiorCompleto(true);
	c.setAnosExperiencia(1);
	c.setAnosRegistroEntidadeClasse(1);
	c.setPontosProva(10);
	

	pontuacaoEnsinoMedio pem = new pontuacaoEnsinoMedio();
	pem.proximaPontuacao(c);

	System.out.println(c);
	
	}

}
