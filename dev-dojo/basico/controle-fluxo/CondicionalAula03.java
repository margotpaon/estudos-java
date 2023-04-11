/* Dado um determinado salário
   Se o mesmo for maior 4500 imprima 30% do valor
   Se não imprima 15% */

import java.util.Scanner;

public class CondicionalAula03{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Qual é seu salário?");
	float salario =  scanner.nextFloat();
	if(salario>=4500){
	    float calc = salario * 0.30F;
	    System.out.println(" O desconto sobre o salário vai ser de R$: "+calc);
	}else{
	    float calc = salario * 0.15F;
	    System.out.println("O desconto sobre o salário vai ser de R$: "+calc);
	}
    }
}
