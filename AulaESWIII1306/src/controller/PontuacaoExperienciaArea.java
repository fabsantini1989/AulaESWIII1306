package controller;

import model.Candidato;

public class PontuacaoExperienciaArea implements IPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int pontuacaoTotal = 0;
		if (c.getAnosExperiencia() > 0) {
			
			pontuacaoTotal = c.getAnosExperiencia()*2;
		}
		
	return c.getPontosProva() + pontuacaoTotal;
	
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		// TODO Auto-generated method stub
		c.setPontosProva(calculaPontuacao(c));
		
		pontuacaoEnsinoMedio pontEnsinoMedio = new pontuacaoEnsinoMedio();
		pontEnsinoMedio.proximaPontuacao(c);
		
	}

}
