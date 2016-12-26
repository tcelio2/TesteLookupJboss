package br.com.ejbserver;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Pessoa implements PessoaLocal {

   
    public Pessoa() {
    }

	@Override
	public String mostrarNome() {
		
		return "Resposta do servidor!!! Nome: Carlos!";
	}

	@Override
	public int calcDolar(int value) {
		return 0;
	}

}
