public class Plays {
    public enum possiblePlays {
        PEDRA,
        PAPEL,
        TESOURA,
        SAIR
    }
    public static void win(possiblePlays p1choose)  {
        possiblePlays b1choose = Bot.botChoose();

        if (p1choose == b1choose) {
            System.out.println("Voces empataram, tente novamente !");
        } else if ((p1choose == possiblePlays.PEDRA && b1choose == possiblePlays.TESOURA) ||
                    (p1choose == possiblePlays.PAPEL && b1choose == possiblePlays.PEDRA) ||
                    (p1choose == possiblePlays.TESOURA && b1choose == possiblePlays.PAPEL)) {
            System.out.println("Parabens, Você ganhou !!!");
        } else {
            System.out.println("Você perdeu, tente novamente !!!");
        }
    }
}

