package teste;

import java.util.Scanner;

public class MyClass {
  public static String processInput(String inputLine) {
    //Aqui voce pode codificar seu algoritmo e processar a entrada. 
    return inputLine;
  }

  //Essa funcao geralmente nao precisa ser alterada.
  public static void main(String args[]) {
    Scanner scanner = new Scanner (System.in);
    		
    int numCli;
    
    System.out.printf("");
    int itensCons = scanner.nextInt();
   
    int[] precoPedido = new int [itensCons];
    		
    String[] itens = new String[itensCons];
    for(int i = 0; i < itensCons; i++){
      System.out.printf("");
      itens [i] = scanner.next();
    }
    String vet = itens[].split(" ");
    
    String foraDiv = null;
    
    
    while (scanner.hasNext() == true) {
      String inputLine = scanner.nextLine();
      System.out.println(processInput(inputLine));
    }
  }
}