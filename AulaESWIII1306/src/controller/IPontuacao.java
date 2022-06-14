package controller;

import model.Candidato;

public interface IPontuacao {
	
	public int calculaPontuacao(Candidato c);
	public void proximaPontuacao(Candidato c);
	
	
}
