package com.ejbcliente.principal;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

public class TestWL {

	public static void main(String[] args) {
		try
		{
		/*Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		env.put(Context.SECURITY_PRINCIPAL,"weblogic");
		env.put(Context.SECURITY_CREDENTIALS,"weblogic");
		env.put(Context.PROVIDER_URL,"t3://localhost:8003");
		Context ctx = new InitialContext(env);
		System.out.println("Initial Context created");
		PessoaRemote = (PessoaRemote) ctx.lookup("HelloWorld#com.upog.demo.HelloWorld");
		System.out.println("lookup successful");
		System.out.println("Calling EJB method . . .");
		helloWorld.sayHello("Upog");
		System.out.println("Output will be in Managed server console");*/
		
		}
		catch (Exception e)
		{
		e.printStackTrace();
		}

	}

}
