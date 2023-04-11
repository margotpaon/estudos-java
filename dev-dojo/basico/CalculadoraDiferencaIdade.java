/*
  Crie uma classe chamada CalculadoraDiferencaIdade
  Crie uma variavel para armazenar a primeira idade
  Crie uma outra variavel para armazenar a segunda idade
  Crie uma outra variavel para calcular a diferença
  Imprima em tela a diferença entre as idades
*/

public class CalculadoraDiferencaIdade{
    public static void main(String[] args){
	byte idade1 = 45;
	byte idade2 = 34;
	byte diferenca = (byte)(idade1 - idade2);
	if(diferenca < 0){ diferenca = (byte)(diferenca * -1);}
	System.out.println("A diferença de idade é = "+diferenca);
    }
}
