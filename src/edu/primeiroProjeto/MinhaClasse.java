package edu.primeiroProjeto;

public class MinhaClasse {
	
	public static void main(String [] args) {
		
		// System.out.print("Olá mundo!" );
		
		final String BR = "Brasil"; // final é uma expressão usada pra criação de constantes
		
		// vsriáveis permitidas
		
		// int _numero
		// int $numero
		// int numero
		// int numero1
		
		// Não é permitido outros símbolos que não seja $ ou _ e nem começar por números
			
		String primeiroNome = "Giuliano";
		String segundoNome  = "César";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		
		System.out.print(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "O Resultado foi" + primeiroNome.concat(" ").concat(segundoNome);
	}

}
