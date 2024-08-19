package view;

import controller.Operacoes;

public class Principal
{

	public static void main(String[] args) 
	{
		Operacoes op = new Operacoes();
		int n=4;
		double res =op.soma(n);
		System.out.println(res);
	}

}
