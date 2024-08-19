package controller;

public class Operacoes
{
	public Operacoes() 
	{
		super();
	}

	public double soma(int num) 
	{
		double s=0;
		if (num == 1)  //quando o número chegar 01 o programa retorna o seu valor para a própria soma .
		{
			return num;                   //if(n==num)
		}                                      //return num;
		else 
		{
			s=(1/(double)fatorial(num)); // s=(1/(double)fatorial(n);
			return s +soma(num-1);       //return s+soma(n+1);
		}

	}

	public int fatorial(int n) {

		if (n == 1)               //se(num==n);
		{                            
			return 1;               //return num; 
		}
		else
		{
			return n * fatorial(n - 1);  //return num*(fatorial(num+1);
		}

	}
}
