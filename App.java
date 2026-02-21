import core.Game;

import ia.*;
import ia.Daniel.DanielIA;

public class App {
    public static void main(String[] args) {
        // Substituir a implementação de cada um em jogador1 e jogador2
        //Aqui os dois jogadores possui a mesma implementação de Daniel. 
        ia.Player jogador1 = new DanielIA("Jogador 1");
        ia.Player jogador2 = new DanielIA("Jogador 2");

        Game game = new Game(jogador2, jogador1);
        game.start();
    }
}