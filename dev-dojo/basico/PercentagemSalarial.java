/*
  Criar uma classe
  Aceitar do usuário para entrada do salario
  Definir o valor da percentagem
  Calcular a porcetagem
  Exibir o salario liquido
*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentagemSalarial{
    public static void main(String[] args){
	System.out.println("Digite seu salário bruto, por exemplo, 1247,59");
	Scanner scanner = new Scanner(System.in);
	float salario = scanner.nextFloat();
	float percentagem = 0.3F;
	float salarioLiquido = salario - (salario * percentagem);
	BigDecimal salarioLiquidoArrendondado = new BigDecimal(salarioLiquido).setScale(2, RoundingMode.HALF_UP);
	salarioLiquido = salarioLiquidoArrendondado.floatValue();
	System.out.println("O Salário Liquido é = R$"+salarioLiquido);
    }
}
