package br.com.hermestest;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com colections", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Rodrigues", 34672);
		Aluno a2 = new Aluno("Guilherme TaToo", 57812);
		Aluno a3 = new Aluno("Rosa Maria", 19588);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno 57812?");
		Aluno aluno = javaColecoes.buscaMatriculado(57813);
		System.out.println("Aluno: " + aluno );

	}

}
