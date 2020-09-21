package br.com.hermestest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	//Desta forma vc não permite que seja feita uma inclusão/alteração/remoção desta lista sem 
	// que seja utilizado o metodo desta classe.  
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	
}
