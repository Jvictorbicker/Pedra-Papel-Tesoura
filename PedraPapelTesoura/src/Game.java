public class Game {
    public static void Playing() {
        Controller.Plays escolhajogador = Player.escolhaPlayer();

        while (escolhajogador != Controller.Plays.SAIR) {
            Controller.win(escolhajogador);
            escolhajogador = Player.escolhaPlayer();
        }
    }
    public static void main(String[] args) {
        Playing();
    }
}
