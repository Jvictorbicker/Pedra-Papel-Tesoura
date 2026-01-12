import java.util.Scanner;

public class Player {
    public static int escolhaPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("PEDRA");
        System.out.println("PAPEL");
        System.out.println("TESOURA");
        System.out.println("Sair");
        System.out.println("---------------");

        System.out.print("Faça sua escolha: ");
        int escolha = scanner.nextInt();

        int playerChose = 0;

        switch (escolha) {
            case 1:
                playerChose = 1;
            case 2:
                playerChose = 2;
            case 3:
                playerChose = 3;
            case 4:
                System.out.println("saindo...");
                return 0;
            default:
                System.out.println("Escolha inválida, tente novamente.\n");
        }
        return playerChose;
    }
}
