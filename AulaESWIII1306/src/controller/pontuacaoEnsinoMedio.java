package controller;
import model.Candidato;


public class pontuacaoEnsinoMedio implements IPontuacao {
	
	@Override
	public int calculaPontuacao(Candidato c) {
		
		int pontuacaoTotal = 0;
			if (c.isEnsinoMedioPublico() == true) {
				
				pontuacaoTotal = pontuacaoTotal + 5;
			}
			
		return c.getPontosProva() + pontuacaoTotal;
		
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		// TODO Auto-generated method stub
		c.setPontosProva(calculaPontuacao(c));
		
		PontuacaoEnsinoSuperior pontEnsinoSuperior = new PontuacaoEnsinoSuperior();
		pontEnsinoSuperior.proximaPontuacao(c);
		
		
	}
		

}
