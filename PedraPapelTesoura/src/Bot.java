import java.util.Random;

public class Bot {
    static Random random = new Random();

    public static Plays.possiblePlays botChoose() {
        int option = random.nextInt(3) + 1;

        switch (option)  {
            case 1:
                System.out.println("Bot escolheu Pedra");
                return Plays.possiblePlays.PEDRA;
            case 2:
                System.out.println("Bot escolheu Papel");
                return Plays.possiblePlays.PAPEL;
            case 3:
                System.out.println("Bot escolheu Tesoura");
                return Plays.possiblePlays.TESOURA;
            default:
                System.out.println("Opção invalida, selecione um opcao Valida!");
        }
        return Plays.possiblePlays.SAIR;
    }
}