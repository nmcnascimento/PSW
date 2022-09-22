import java.util.Scanner;
//import java.io.*;

public class App {
    public static void main(String[] args) {
        String[][] grid = new String[10][10];
        int mrow, mcol;
        Boolean run = true;
        boolean flag = false;
        Character player = new Character();

        //fill with " " all the matrix
        for(int i = 0; i <10; i++){
            for(int j = 0 ; j<10; j++){
                grid[i][j] = " ";
            }
        }


        //create down and up wall
        for(int j = 0; j < 10; j++){
            grid[0][j] = "X";
            grid[9][j] = "X";
        }

        //left and right wall
        for(int i = 0; i<10; i++){
            grid[i][0] = "X";
            grid[i][9] = "X";
        }

        //interior wall
        for(int i = 2; i<9; i++){
            for(int j = 2; j<4; j++){
                grid[i][j] = "X";
            }
        }
        grid[5][2]= " ";
        grid[5][3]= " ";
        
        for(int i = 2; i <8; i++ ){
            grid[i][5] = "X";
            grid[i][7] = "X";
        }
        grid[5][5] = " ";



        //adding hero dragon key and exit
        grid[1][1] = "H";
        grid[3][1] = "D";
        grid[8][1] = "K";
        grid[5][9] = "E";
        player.row = 1;
        player.col = 1;
        player.key = 0;


        System.out.println();


        for(int row=0; row<grid.length; row++){
            for(int col = 0; col<grid[row].length; col++){
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Number of keys: "+ player.key);

        while(run){
            Scanner mov = new Scanner(System.in);
            System.out.println("Choose the direction of your next move (W,A,S,D):");

            char dir = mov.next().charAt(0);
            System.out.println(dir + " it is!");

            switch (dir) {
                case 'W':
                System.out.println("case W");
                mrow = player.row;
                mcol = player.col;
                    if(grid[mrow-1][mcol] == " "){
                        grid[mrow-1][mcol] = "H";
                        grid[mrow][mcol] = " ";
                        player.row = mrow-1;

                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("Number of keys: "+ player.key);
                        if (checkDragon(player.row, player.col, grid) == 0) {
                            System.out.println("GAME OVER!");
                            mov.close();
                            run = false;
                        }
                    }
                    else if(grid[mrow-1][mcol] == "K"){
                        grid[mrow-1][mcol] = "H";
                        grid[mrow][mcol] = " ";
                        player.row = mrow-1;
                        player.key++;
                        if(player.key == 1){
                            genkey(grid);
                        }
                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("Number of keys: "+ player.key);
                    }
                    else if (grid[mrow-1][mcol] == "E") {
                        if (player.key == 3) {
                            grid[mrow-1][mcol] = "H";
                            grid[mrow][mcol] = " ";
                            for(int row=0; row<grid.length; row++){
                                for(int col = 0; col<grid[row].length; col++){
                                    System.out.print(grid[row][col] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println("You managed to escape!!");
                            mov.close();
                            run = false;
                            
                        }
                        else{
                            System.out.println("Invalid Move!");
                        }
                    }
                    else{
                        System.out.println("Invalid Move!");
                    }
                    
                    break;
                case 'A':
                    System.out.println("case A");
                    mrow = player.row;
                    mcol = player.col;
                    if(grid[mrow][mcol-1] == " "){
                        grid[mrow][mcol-1] = "H";
                        grid[mrow][mcol] = " ";
                        player.col = mcol-1;

                        for(int row=0; row<grid.length; row++){
                          for(int col = 0; col<grid[row].length; col++){
                            System.out.print(grid[row][col] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Number of keys: "+ player.key);
                    if (checkDragon(player.row, player.col, grid) == 0) {
                        System.out.println("GAME OVER!");
                        mov.close();
                        run = false;
                    }
                }
                else if(grid[mrow][mcol-1] == "K"){
                    grid[mrow][mcol-1] = "H";
                    grid[mrow][mcol] = " ";
                    player.col = mcol-1;
                    player.key++;
                    if(player.key == 1){
                        genkey(grid);
                    }
                    for(int row=0; row<grid.length; row++){
                        for(int col = 0; col<grid[row].length; col++){
                            System.out.print(grid[row][col] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Number of keys: "+ player.key);
                }
                else if (grid[mrow][mcol-1] == "E") {
                    if (player.key == 3) {
                        grid[mrow][mcol-1] = "H";
                        grid[mrow][mcol] = " ";
                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("You managed to escape!!");
                        mov.close();
                        run = false;
                    }
                    else{
                        System.out.println("Invalid Move!");
                    }
                }
                else{
                    System.out.println("Invalid Move!");
                }
                    break;
                case 'S':
                    System.out.println("case S");
                    mrow = player.row;
                    mcol = player.col;
                    if(grid[mrow+1][mcol] == " "){
                        grid[mrow+1][mcol] = "H";
                        grid[mrow][mcol] = " ";
                        player.row = mrow+1;

                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("Number of keys: "+ player.key);
                        if (checkDragon(player.row, player.col, grid) == 0) {
                            System.out.println("GAME OVER!");
                            mov.close();
                            run = false;
                        }
                    }
                    else if(grid[mrow+1][mcol] == "K"){
                        grid[mrow+1][mcol] = "H";
                        grid[mrow][mcol] = " ";
                        player.row = mrow+1;
                        player.key++;
                        if(player.key == 1){
                            genkey(grid);
                        }
                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("Number of keys: "+ player.key);
                    }
                    else if (grid[mrow+1][mcol] == "E") {
                        if (player.key == 3) {
                            grid[mrow+1][mcol] = "H";
                            grid[mrow][mcol] = " ";
                            for(int row=0; row<grid.length; row++){
                                for(int col = 0; col<grid[row].length; col++){
                                    System.out.print(grid[row][col] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println("You managed to escape!!");
                            mov.close();
                            run = false;
                        }
                        else{
                            System.out.println("Invalid Move!");
                        }
                    }
                    else{
                        System.out.println("Invalid Move!");
                    }
                    break;
                case 'D':
                System.out.println("case D");
                    mrow = player.row;
                    mcol = player.col;
                    if(grid[mrow][mcol+1] == " "){
                        grid[mrow][mcol+1] = "H";
                        grid[mrow][mcol] = " ";
                        player.col = mcol+1;

                        for(int row=0; row<grid.length; row++){
                          for(int col = 0; col<grid[row].length; col++){
                            System.out.print(grid[row][col] + " ");
                        }
                        System.out.println();
                        }
                        System.out.println("Number of keys: "+ player.key);
                        if (checkDragon(player.row, player.col, grid) == 0) {
                            System.out.println("GAME OVER!");
                            mov.close();
                            run = false;
                        }
                    }
                    else if(grid[mrow][mcol+1] == "K"){
                        grid[mrow][mcol+1] = "H";
                        grid[mrow][mcol] = " ";
                        player.col = mcol+1;
                        player.key++;
                        if(player.key == 1){
                            genkey(grid);
                        }
                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("Number of keys: "+ player.key);
                    }
                    else if (grid[mrow][mcol+1] == "E") {
                        if (player.key == 3) {
                            grid[mrow][mcol+1] = "H";
                            grid[mrow][mcol] = " ";
                            for(int row=0; row<grid.length; row++){
                                for(int col = 0; col<grid[row].length; col++){
                                    System.out.print(grid[row][col] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println("You managed to escape!!");
                            mov.close();
                            run = false;
                        }
                        else{
                            System.out.println("Invalid Move!");
                        }

                    }
                    else{
                        System.out.println("Invalid Move!");
                    }
                    
                    break;
                case 'Q':
                    flag = true;
                    System.out.println("Closing the game");
                    mov.close();
                break;
            }
            if (flag) {
                break;
            }

            
        }
    }

    public static void genkey(String[][] grid){
        boolean flag = false;
        int nkey = 0;
        int nrow;
        int ncol;
        int dragflag;
        while (!flag) {
            nrow = getRandom(0, 9);
            ncol = getRandom(0, 9);
            if(grid[nrow][ncol] == " " ){
                dragflag = checkDragon(nrow, ncol, grid);
                if(dragflag == 1){
                    grid[nrow][ncol] = "K";
                    nkey++;
                }
                
            }
            if(nkey == 2){
                flag = true;
            }
        }
    }

    private static int getRandom( int min, int max) {
        if(min>= max){
            throw new IllegalArgumentException("limit error");
        }
        return (int)(Math.random()*((max-min)+1))+min;
    }

    private static int checkDragon(int row, int col, String[][] grid){
        if (grid[row-1][col] == "D") {
            return 0;
        }
        else if (grid[row+1][col] == "D") {
            return 0;
        }
        else if (grid[row][col-1] == "D") {
            return 0;
        }
        else if (grid[row][col+1] == "D") {
            return 0;
        }
        else{
            return 1;
        }
        
    }

}