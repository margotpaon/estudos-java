/*

Como secretário de alistamento militar necessito de um sistema que possua
os paramentros de sexo e idade, sendo sexo M ou F e realize a seguinte
classificação:

- Se sexo for M e idade é igual ou maior que 18 anos exiba em tela alistamento obrigatório
- Se sexo for F e idade é igual ou maior que 18 anos exiba se gostaria de se alistar
- Se sexo for M ou F e a idade for infeiro a 18 anos exiba que o alistamento não é permito 

*/


import java.util.Scanner;

public class CondicionalAula07{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe o seu sexo (M/F): ");
    String sexo = input.nextLine();

    System.out.println("Informe a sua idade: ");
    byte idade = input.nextByte();

    if (sexo.equals("M") && idade >= 18) {
      System.out.println("Alistamento obrigatório!");
    } else if (sexo.equals("F") && idade >= 18) {
      System.out.println("Gostaria de se alistar?");
    } else {
      System.out.println("Alistamento não permitido!");
    }

    input.close();
  }
}
