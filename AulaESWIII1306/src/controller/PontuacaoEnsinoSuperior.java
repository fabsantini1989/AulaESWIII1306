package controller;

import model.Candidato;

public class PontuacaoEnsinoSuperior implements IPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {

		int pontuacaoTotal = 0;
		if (c.isEnsinoSuperiorCompleto() == true) {
			
			pontuacaoTotal = pontuacaoTotal + 10;
		}
		
	return c.getPontosProva() + pontuacaoTotal;
		
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		// TODO Auto-generated method stub
		c.setPontosProva(calculaPontuacao(c));
		
		PontuacaoEntidadeClasse pontEntidadeClasse = new PontuacaoEntidadeClasse();
		pontEntidadeClasse.proximaPontuacao(c);
	}
}

