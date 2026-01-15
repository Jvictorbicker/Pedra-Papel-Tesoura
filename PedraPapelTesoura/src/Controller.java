public class Controller {
    public enum Plays {
        PEDRA,
        PAPEL,
        TESOURA,
        SAIR
    }
    public static void win(Controller.Plays escolhajogador) {
        Controller.Plays escolhabot = Bot.Chose();

        if (escolhabot == escolhajogador) {
            System.out.println("Voces empataram, tente novamente !");
        } else if (
                (escolhajogador == Plays.PEDRA && escolhabot == Plays.TESOURA) ||
                (escolhajogador == Plays.PAPEL && escolhabot == Plays.PEDRA) ||
                (escolhajogador == Plays.TESOURA && escolhabot == Plays.PAPEL)) {
            System.out.println("Parabens voce ganhou !!");
        } else {
            System.out.println("Voce perdeu tente novamente !!");
        }
    }
}
