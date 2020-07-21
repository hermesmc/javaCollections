# teste-java

https://docs.oracle.com/javase/8/docs/api/

## Indice

- Pacotes Java:
  - Java.lang
  - Java.util
  - Java.io
- Collections  

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
