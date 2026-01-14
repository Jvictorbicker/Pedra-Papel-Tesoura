import java.util.Random;

public class Bot {
    public static Controller.Plays Chose() {
        Random random = new Random();

        int escolha = random.nextInt(3) + 1;

        switch (escolha) {
            case 1:
                System.out.println("Bot escolheu Pedra");
                return Controller.Plays.PEDRA;
            case 2:
                System.out.println("Bot escolheu Papel");
                return Controller.Plays.PAPEL;
            case 3:
                System.out.println("Bot escolheu Tesoura");
                return Controller.Plays.TESOURA;
            case 4:
                System.out.println("saindo...");
                return Controller.Plays.SAIR;
            default:
                return null;
        }
    }
}