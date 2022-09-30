import java.util.Scanner;

public class Main {

    //This file is used
    public static void main(String[] args){
        char dir;
        Game game = new Game();
        game.start();
        do{
            Scanner mov = new Scanner(System.in);
            System.out.println("Choose the direction of your next move (W,A,S,D) or q to quit:");
            dir = mov.next().charAt(0);
            System.out.println(dir + " it is!");

        }while(dir != 'q');
        
    }

}
