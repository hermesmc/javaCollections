package br.com.hermestest;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);

		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
			
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		for(int i = 0; i < aulas.size(); i++) {
			int j = i;
			j++;
			System.out.println("Aula " + j + ": " + aulas.get(i));
		}
		
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		//antes de ordenar
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
		});
		
		Collections.sort(aulas); //Ordenando o array
		
		//depois de ordenar
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
		});
		
	}

}
