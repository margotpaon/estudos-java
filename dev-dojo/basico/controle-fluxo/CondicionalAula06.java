/*
Eu como usuário gostaria de ter o nome e a idade de participantes de um torneio de natação
e que o sistema classifica-se as categorias das seguintes formas:
- Até 10 anos => Nome participara da categoria infantil
- Entre 11 e 15 anos => Nome participara da categoria juvenil
- Entre 16 e 19 anos => Nome participara da categoria pré-adulto
- Igual ou acima de 20 anos => Nome participara da categoria adulto
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CondicionalAula06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Participante> participantes = new ArrayList<>();
	System.out.println("Digite o número de participantes");
	int numParticipantes = scanner.nextInt();
	scanner.nextLine();

        // Solicitação dos dados dos participantes
        for (int i = 1; i <= numParticipantes; i++) {
            System.out.println("Digite o nome do participante " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do participante " + i + ":");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            // Classificação do participante
            String categoria;
            if (idade <= 10) {
                categoria = "infantil";
            } else if (idade <= 15) {
                categoria = "juvenil";
            } else if (idade <= 19) {
                categoria = "pré-adulto";
            } else {
                categoria = "adulto";
            }

            // Criação do participante e adição na lista
            Participante participante = new Participante(nome, idade, categoria);
            participantes.add(participante);
        }

        // Impressão dos participantes e categorias
        for (Participante participante : participantes) {
            System.out.println("Nome: " + participante.getNome());
            System.out.println("Idade: " + participante.getIdade());
            System.out.println("Categoria: " + participante.getCategoria());
            System.out.println();
        }
    }
}

class Participante {
    private String nome;
    private int idade;
    private String categoria;

    public Participante(String nome, int idade, String categoria) {
        this.nome = nome;
        this.idade = idade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCategoria() {
        return categoria;
    }
}

