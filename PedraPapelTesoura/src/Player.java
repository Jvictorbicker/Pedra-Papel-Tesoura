import java.util.Scanner;

public class Player {
    private static Scanner scanner = new Scanner(System.in);

    public static Plays.possiblePlays playerChoose() {
        while (true) {
            System.out.println("-----------------");
            System.out.println("[1] Pedra");
            System.out.println("[2] Papel");
            System.out.println("[3] Tesoura");
            System.out.println("[4] Sair");
            System.out.println("-----------------");

            System.out.print("Digite sua opcao: ");
            int option = scanner.nextInt();

            switch (option)  {
                case 1:
                    System.out.println("Voce escolheu Pedra");
                    return Plays.possiblePlays.PEDRA;
                case 2:
                    System.out.println("Voce escolheu Papel");
                    return Plays.possiblePlays.PAPEL;
                case 3:
                    System.out.println("Voce escolheu Tesoura");
                    return Plays.possiblePlays.TESOURA;
                case 4:
                    System.out.println("Saindo...");
                    return Plays.possiblePlays.SAIR;
                default:
                    System.out.println("Opção invalida, selecione um opcao Valida!");
            }
        }
    }
}