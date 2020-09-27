# Teste-java: 

Tem o propósito de armazenar os projetos durante o aprendizado de Java.
Somente o objeto muda os atributos deste mesmo objeto, fica a dica.

## Documentação Java

https://docs.oracle.com/javase/8/docs/api/

## Indice

- Atalhos úteis do Eclipse
- Pacotes Java:
  - Java.lang
  - Java.util
  - Java.io
- Collections  

# Atalhos úteis do Eclipse
 - CTRL + 3 e GCUF: Para criar o metodo contrutor;
 - CTRL + 3 e GGAS: Para criar os metodos Getters and Setters;
 - sysout + CTRL+ENTER = System.out.println();

# - java.lang
 É basicamente o pacote que te fornece classes fundamentais para começar a programar em JAVA, como String, Object, entre outras.
# - java.util
 Utilizada na manipulação de arrays
# - java-io
  Pacote responsável pelo controle de entrada e saída de dados.
  ## Formatação de números:
  - https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
  
  ## Tratamento de caracteres especiais:
  - https://home.unicode.org/
  
  ## Serialização:
  Transformação do objeto java da JVM em um fluxo de bits/bytes e vice-versa. Bastante utilizado na comunicação entre máquinas virtuais java. 
  Classes para essa implementação:
  
    - java.io.ObjectOutputStream
    - java.io.ObjectInputStream
    
  ### Exemplo com tipo String:
		
  - Exemplo gravação de arquivo
 
         public class TesteSerializacao {
	        public static void main(String[] args) throws IOException, ClassNotFoundException {
	    
		      String nome = "Hermes Maruyama";				
		      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));		
		      oos.writeObject(nome);
		      oos.close();
		      
	       }	      
	}	      
				
  - Exemplo leitura arquivo
		
        public class TesteSerializacao {
	        public static void main(String[] args) throws IOException, ClassNotFoundException {
	       
                 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
   	             String nomeLido = (String) ois.readObject();		
	             ois.close();
	             System.out.println(nomeLido);
		     
	         }
        }
	
  ### Exemplo outro objeto:
  
  Na classe utilizada para criar o objeto:
  
  inclua 
  
  - implements Serializable
  
  e 
  
   //utilizado para controlar a versão da classe, caso mude algum atributo com tipos incompatíveis o valor deve ser incrementado<br>
   - private static final long serialVersionUID = 1L; //Não obrigatório colocar explicitamente o atributo serialVersionUID, mas é boa prática.
  
  ### Collections
  
  https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
  
  No codigo abaixo, estamos comparando o parametro tempo para ordenar o array. Array este composto pelo titulo da aula e seu tempo:
  
  	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando ArrayLists", 18);
		Aula a2 = new Aula("Listas de objetos", 15);
		Aula a3 = new Aula("Relacionamentos de Listas e Objetos", 16);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3); 
		
  	aulas.sort(Comparator.comparing(Aula::getTempo));
  
  CompareTo na classe aula:  
  
  	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

  ## ArrayList X LinkedList
  
  - O ArrayList funciona muito bem em listas grandes que não vão sofrer alterações de posição dos registros. 
  - Já a LinkedList adiciona muito rápido elemestos na lista. MAs para buscar um determinado registro ela é mais lenta.
  
  ## List X Set
  
  As listas possuem indices e são mais lentas que os conjuntos(sets). A grande vantagem dos conjuntos é a veloidade. 
  Mas não permitem ser ordenadas e a consulta de elemento pelo indice.

  Em listas, ao redefinir o metodo equals, o método hash também deve ser sobreescrito:
  
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
   Desta forma vpcê garante que na tabela de espalhamento o hash do nome será sempre o mesmo.	

   ## Código legado de coleções
   
   O  Iterator é um objeto que todas as coleções nos dão acesso, que serve para iterar entre os elementos dentro da coleção, selecionando sempre o próximo objeto da coleção.
   Um outro objeto antigo que pode ser citado é o Vector, que era utilizado antes da interface Collection existir (Collection existe desde o Java 1.2):

   Vector<Aluno> vetor = new Vector<>();

   Essa classe é muito antiga e se parece com o ArrayList, inclusive ela implementa List atualmente. A diferença é que ela pode ser utilizada por várias threads simultaneamente, chamado de thread safe. 
   
   
