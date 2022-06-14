package controller;

import model.Candidato;

public class PontuacaoEntidadeClasse implements IPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int pontuacaoTotal = 0;
		if (c.getAnosRegistroEntidadeClasse() > 0 ) {
			
			pontuacaoTotal = c.getAnosRegistroEntidadeClasse()*1;
		}
		
	return c.getPontosProva() + pontuacaoTotal;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		// TODO Auto-generated method stub
		c.setPontosProva(calculaPontuacao(c));
		
		PontuacaoExperienciaArea pontExperienciaArea = new PontuacaoExperienciaArea();
		pontExperienciaArea.proximaPontuacao(c);
	}

}
