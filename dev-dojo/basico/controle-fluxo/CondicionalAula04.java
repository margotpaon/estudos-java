/* Dado um número veja se ele é par ou impar */

import java.util.Scanner;

public class CondicionalAula04{
   public static void main(String[] args){
       System.out.println("Digite um número para saber se é par ou ímpar");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	if((number % 2) == 0){
	    System.out.println("O número "+number+" ele é par");
	}else{
	    System.out.println("O número "+number+" ele é impar");	
	}
    }
}
