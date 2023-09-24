package edu.primeiroProjeto;

public class BoletimEstudantil {
	
	public static void main (String [] args) {
		
		int mediaFinal = 5;
		
		if(mediaFinal < 6) 
			System.out.print("Reprovado");
		else if (mediaFinal > 6) 
			System.out.print("Aprovado");
	}
}
