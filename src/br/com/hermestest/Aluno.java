package br.com.hermestest;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome n�o pode ser vazio");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		//cast
		Aluno outro = (Aluno)obj;
		return this.nome.equals(outro.nome); 
		
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
