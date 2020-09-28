package br.com.hermestest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	//private Set<Aluno> alunos = new LinkedHashSet<>();
	//private Set<Aluno> alunos = new TreeSet<>(); //Apenas com classes comparable
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
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

//	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();			
//		}
//		return tempoTotal;
//	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + "tempo total:" + this.getTempoTotal() + "]";
	}


	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);	
		//Usando o mapa
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
		
	}


	public boolean estaMatriculado(Aluno aluno) { 		
		return this.alunos.contains(aluno);
	}


	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("Aluno não encontrado");
		}
		return matriculaParaAluno.get(numero);
	}

}
