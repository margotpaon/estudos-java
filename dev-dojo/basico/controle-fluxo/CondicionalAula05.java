/*Tabela de IRPF 2022

  Até 1903,98 isento
  De 1903,99 até 2826,65 7.5%
  De 2826,66 até 3751,05 15%
  De 3751,06 até 4664,68 22.5%
  Maior que 4664,68 27.5%

*/

import java.util.Scanner;

public class CondicionalAula05{
    public static void main(String[] args){

	System.out.println("Calculo de desconto para IRPF");
	System.out.println("Digite seu sálario");
	Scanner scanner = new Scanner(System.in);
	float salario = scanner.nextFloat();
	if(salario <= 1903.98){
	    System.out.println("Você é isento de imposto de renda");
	}if(salario >= 1903.99 && salario <= 2826.65){
	    float desconto = salario * (7.5F/100);
	    System.out.println("Você terá um desconto de R$"+desconto);
	}if(salario >= 2826.66 && salario <= 3751.05){
	    float desconto = salario * (15F/100);
	    System.out.println("Você terá um desconto de R$"+desconto);
	}if(salario >= 3751.06 && salario <= 4664.67){
	    float desconto = salario * (22.5F/100);
	    System.out.println("Você terá um desconto de R$"+desconto);
	}if(salario >= 4664.68){
	    float desconto = salario * (27.5F/100);
	    System.out.println("Você terá um desconto de R$"+desconto);
	}
	

    }
}
