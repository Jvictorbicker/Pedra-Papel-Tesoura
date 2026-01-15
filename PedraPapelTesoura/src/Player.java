import java.util.Scanner;

public class Player {
    public static Controller.Plays escolhaPlayer() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------");
            System.out.println("[1] Pedra");
            System.out.println("[2] Papel");
            System.out.println("[3] Tesoura");
            System.out.println("[4] Sair");
            System.out.println("---------------");

            System.out.print("Faça sua escolha: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Jogador escolheu Pedra");
                    return Controller.Plays.PEDRA;
                case 2:
                    System.out.println("Jogador escolheu Papel");
                    return Controller.Plays.PAPEL;
                case 3:
                    System.out.println("Jogador escolheu Tesoura");
                    return Controller.Plays.TESOURA;
                case 4:
                    System.out.println("saindo...");
                    return Controller.Plays.SAIR;
                default:
                    System.out.println("Escolha inválida, tente novamente.\n");
            }
        }
    }
}
