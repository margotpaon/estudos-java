/* Receba uma idade com entrada
   Se maior ou igual a 18 é adulto
   Se não ainda não é adulto*/

import java.util.Scanner;

public class CondicionalAula02{
  public static void main(String[] args){
    System.out.println("Fala aí para gente, quanto anos você tem?");
    Scanner scanner = new Scanner(System.in);
    short idade = scanner.nextShort();
    // Operadores lógicos ==, !=, <, <=, >, >=
    if(idade >=18){
      System.out.println("Boa, entra ai tranquilo!");
    }else{
      System.out.println("Ihhh o lá, a criança se acha grande, vaza daqui e só volta quando for mais velha");
    }
  }
}
