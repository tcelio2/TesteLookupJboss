package br.com.ejbserver;

import javax.ejb.Local;

@Local
public interface PessoaLocal {

	public String mostrarNome();
	public int calcDolar(int value);
	
}
