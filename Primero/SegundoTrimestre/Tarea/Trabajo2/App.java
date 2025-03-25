package Primero.SegundoTrimestre.Tarea.Trabajo2;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        new Thread (() -> {
            TicTacToeClient.main(args);
        }).start();

        new Thread (() -> {
            TicTacToeServer.main(args);
        }).start();
    }
}
