class StringManipulations {

  public static void main(String[] args) {

    String str = "http://www.academiadecodigo.org";

    String domain = str.substring(7); // www.academiadecodigo.org
    String name = "";   // < Academia de Codigo_ >

    // print the following message at the end
    // I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org
  
    String str1 = "I am a Code Cadet at ";
  
    String upperA = domain.substring(4,5);
    upperA = upperA.replace("a","A");
    //System.out.println(upperA);

    String upperC = domain.substring(14,15);
    upperC = upperC.replace("c","C");
    //System.out.println(upperC);


    name = "< " + upperA + domain.substring(5,12) + " " + domain.substring(12,14) + " " + 
           upperC + domain.substring(15,20) + "_ >, ";
  

    System.out.println(str1 + name + domain);

  }

}

//Nota:
// Criei uma variável com o nome xxx do tipo String à qual inicializei atribuindo o valor de retorno
// da invocação do método substring sob a variável name.

