package br.com.hermestest;

import java.util.List;

public class TestaCurso {

	public static void main(String args[]) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
	//	List<Aula> aulas = javaColecoes.getAulas();
	//	System.out.println(aulas);
		
	//	aulas.add(new Aula("Trabalhando com arrayLists", 21));
		
	//  javaColecoes.getAulas().add(new(Aula("Trabalhando com colections", 21)));
		
		javaColecoes.adiciona(new Aula("Trabalhando com colections", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
		
	}	
	
	
	
}
