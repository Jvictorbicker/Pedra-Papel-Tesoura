public class Game {
    public static void Start() {
        Plays.possiblePlays escolhajogador = Player.playerChoose();

        while (escolhajogador != Plays.possiblePlays.SAIR) {
            Plays.win(escolhajogador);
            escolhajogador = Player.playerChoose();
        }
    }
    public static void main(String[] args) {
        Start();
    }
}