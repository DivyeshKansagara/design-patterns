//package TicToe;
//
//import com.sun.tools.javac.util.Pair;
//
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//public class TicToeGame {
//    Deque<Player> players;
//    Board board;
//    public void initilizeGame(){
//        players = new LinkedList<>();
//        PlayingPiece playingPieceX = new PlayingPieceX();
//        PlayingPiece playingPieceO = new PlayingPieceO();
//        Player player1 = new Player("player1",playingPieceX);
//        Player player2 = new Player("player2",playingPieceO);
//        players.add(player1);
//        players.add(player2);
//        board = new Board(3);
//    }
//
//    public String startGame(){
//        boolean winner = false;
//        while (!winner){
//            Player playerTurn = players.removeFirst();
//            board.printBoard();
//            List<Pair<Integer, Integer>> freeSpaces =  gameBoard.getFreeCells();
//            if(freeSpaces.isEmpty()) {
//                winner = false;
//                continue;
//            }
//
//            //read the user input
//            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
//            Scanner inputScanner = new Scanner(System.in);
//            String s = inputScanner.nextLine();
//            String[] values = s.split(",");
//            int inputRow = Integer.valueOf(values[0]);
//            int inputColumn = Integer.valueOf(values[1]);
//
//
//            //place the piece
//            boolean pieceAddedSuccessfully = board.addPiece(inputRow,inputColumn, playerTurn.playingPiece);
//            if(!pieceAddedSuccessfully) {
//                //player can not insert the piece into this cell, player has to choose another cell
//                System.out.println("Incorredt possition chosen, try again");
//                players.addFirst(playerTurn);
//                continue;
//            }
//            players.addLast(playerTurn);
//
//            winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
//            if(winner) {
//                return playerTurn.name;
//            }
//
//        }
//    }
//}
