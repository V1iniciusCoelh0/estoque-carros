package Main;

import Modelos.Carro;

import java.util.Scanner;
import java.util.ArrayList;

import Modelos.Estoque;

public class Main{
      public static void main(String []args){
          Scanner sc = new Scanner(System.in);
          Estoque estoque = new Estoque();
          int opcao;


        Carro c1 = new Carro("ford","C3PO-501", 2018);


        do {
            System.out.println("1 - Adicionar Carro");
            System.out.println("2 - Listar Carro");
            System.out.println("3 - Remover Carros");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Placa: ");
                    String placa = sc.nextLine();
                    System.out.println("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    estoque.adicionarCarro(new Carro(modelo, placa, ano));
                    break;
                case 2:
                    estoque.listarCarros();
                    break;
                case 3:
                    System.out.println("Digite a placa para remover: ");
                    String placaRemover = sc.nextLine();
                    estoque.removerCarroPorPlaca(placaRemover);
                    break;
            }
        }while (opcao != 0);
    }
}