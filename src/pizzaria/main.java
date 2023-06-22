package pizzaria;

import java.util.Scanner;

import cozinha.Calabresa;
import cozinha.FrangoCatupiry;
import cozinha.FrangoMilho;
import cozinha.Pizza;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou o Pizza de Frango e milho");
                    Pizza pizzaFrangoMilho = new PizzaFrangoMilho(new FrangoMilho());
                    pizzaFrangoMilho.criar();
                    break;
                case 2:
                    System.out.println("Você selecionou o Pizza de Calabresa");

                    Pizza pizzaCalabresa = new PizzaCalabresa(new Calabresa());
                    pizzaCalabresa.criar();
                    break;
                case 3:
                	System.out.println("Você selecionou o Pizza de Frango e catupiry");
                    Pizza pizzaFrangoCatupiry = new PizzaFrangoCatupiry(new FrangoCatupiry());
                    pizzaFrangoCatupiry.criar();
                    break;                    
                case 4:
                    System.out.println("Saindo do sistema...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
    
    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Pizza de Frango e milho");
        System.out.println("2 - Pizza de Calabresa");
        System.out.println("3 - Pizza de Frango e catupiry");
        System.out.println("4 - Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }
}

