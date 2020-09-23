package br.com.hermestest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	
	// * Conjuntos não aceitam elementos repetidos
	// * Velocidade e performance como vantagem
	
	public static void main(String[] args) {
		//Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Rodrigues");
		alunos.add("Daniel Verissimo");
		alunos.add("Max Lopes");
		alunos.add("Sergio Planelis");
		alunos.add("Vinicius Caldeira");
		alunos.add("Aline Lago");
		
		System.out.println(alunos);
		
		alunos.remove("Max Lopes");
		
		for (String aluno : alunos) {
			System.out.println(aluno);			
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		boolean alunoMatriculado = alunos.contains("Aline Lago");
		System.out.println(alunoMatriculado);
		
		// Passando um set para uma lista
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
		
		System.out.println(alunosEmLista); 
	}

}
