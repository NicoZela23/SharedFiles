import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Client <servidor> <nombre del jugador>");
            System.exit(1);
        }

        try {
            ITicTacToe game = (ITicTacToe) Naming.lookup("//" + args[0] + "/TicTacToe");
            Scanner stdin = new Scanner(System.in);

            int id = game.addPlayer(args[1]);

            if (id == -1) {
                System.err.println("Nombre ya en uso");
                System.exit(1);
            }

            if (id == -2) {
                System.err.println("Número de jugadores excedido");
                System.exit(1);
            }

            int hasMatch = game.hasMatch(id);

            System.out.println("Buscando partida ...");

            while (hasMatch != 1 && hasMatch != 2) {
                if (hasMatch == -2) {
                    System.err.println("Tiempo de espera agotado");
                    System.exit(1);
                }

                if (hasMatch == -1) {
                    System.err.println("Error en el servidor");
                    System.exit(1);
                }

                Thread.sleep(1000);
                hasMatch = game.hasMatch(id);
            }

            System.out.println("Segundo jugador " + game.getOpponent(id) + " entro ....");

            int isMyTurn;
            String message = null;

            while (true) {

                isMyTurn = game.isMyTurn(id);

                if (isMyTurn == -2) {
                    System.err.println("No hay dos jugadores en la partida");
                    game.endMatch(id);
                    System.exit(1);
                }

                if (isMyTurn == -1) {
                    System.err.println("Error en el servidor");
                    game.endMatch(id);
                    System.exit(1);
                }

                switch (isMyTurn) {
                    case 2:
                        message = "Ganaste!";
                        break;
                    case 3:
                        message = "Perdiste!";
                        break;
                    case 4:
                        message = "Empate!";
                        break;
                    case 5:
                        message = "Ganaste!";
                        break;
                    case 6:
                        message = "Perdiste!";
                        break;
                }

                if (isMyTurn > 1 && isMyTurn < 7) {
                    System.out.println(message);

                    if (game.endMatch(id) == -1) {
                        System.err.println("Error al cerrar el juego");
                        System.exit(1);
                    } else {
                        System.out.println("Partida finalizada!");
                        System.exit(0);
                    }
                }

                int ret_movePieza = -1;

                while ((ret_movePieza != 1) && (ret_movePieza != -3) && (isMyTurn == 1)) {

                    System.out.println(game.getBoard(id));

                    System.out.println("Realice su jugada");
                    System.out.print("Linea: ");
                    int linea = stdin.nextInt();

                    System.out.print("Columna: ");
                    int columna = stdin.nextInt();

                    ret_movePieza = game.move(id, linea, columna);

                    switch (ret_movePieza) {
                        case 2:
                            System.out.println("Perdiste!");
                            game.endMatch(id);
                            System.exit(0);
                        case 1:
                            System.out.println("Jugada realizada");
                            System.out.println(game.getBoard(id));
                            break;
                        case 0:
                            System.out.println("Jugada invalida");
                            break;
                        case -1:
                            System.out.println("Parametro inválido");
                            break;
                        case -2:
                            System.err.println("No hay dos jugadores en la partida");
                            game.endMatch(id);
                            System.exit(1);
                        case -3:
                            System.out.println("Parametro inválido");
                            break;
                        case -4:
                            System.out.println("No es tu turno");
                            break;
                    }

                }
            }

        } catch (Exception e) {
            System.err.println("TicTacToe client failed");
            System.err.println(e.toString());
        }    }
}