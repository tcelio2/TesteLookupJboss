package com.ejbcliente.principal;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import br.com.ejbserver.PessoaLocal;

public class Test {

	public static void main(String[] args) {

		try {
			Properties p = new Properties();
			p.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			p.put("jboss.naming.client.ejb.context", false);//quando vc poe false, um remote call jndi transforma-se
												//vira uma chamada remota mesmo estando local afim de testar...
			final String appName = "";  
            final String moduleName = "EJBServer";  
            final String distinctName = "";  
			final Context context = new InitialContext(p);  
			final String beanName = br.com.ejbserver.Pessoa.class.getSimpleName();     //classe  
			final String viewClassName = br.com.ejbserver.PessoaLocal.class.getName();  //Interface 
			String ejbValue = "ejb:"+appName+"/"+moduleName+"/"+ distinctName+"/"+beanName+"!"+viewClassName;
					PessoaLocal sm = (PessoaLocal) context.lookup(ejbValue);
			System.out.println("Nome da Pessoa: "+sm.mostrarNome());
		
		
		} catch (Exception e) {
			System.out.println("Erro::: "+e.getMessage()+"-->"+e.getCause());
		}
		
		
	}

}
