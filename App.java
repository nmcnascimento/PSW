import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[][] grid = new String[10][10];
        int[][] pos = new int[1][2];
        int mrow, mcol;

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
        pos[0][0] = 1;
        pos[0][1] = 1;


        System.out.println();


        for(int row=0; row<grid.length; row++){
            for(int col = 0; col<grid[row].length; col++){
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

        while(true){
            Scanner mov = new Scanner(System.in);
            System.out.println("Choose the direction of your next move (W,A,S,D):");

            char dir = mov.next().charAt(0);
            System.out.println(dir + " it is!");

            switch (dir) {
                case 'W':
                System.out.println("case W");
                mrow = pos[0][0];
                mcol = pos[0][1];
                    if(grid[mrow-1][mcol] == " "){
                        grid[mrow-1][mcol] = "H";
                        grid[mrow][mcol] = " ";
                        pos[0][0] = mrow-1;

                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println("Invalid Move!");
                    }
                    
                    break;
                case 'A':
                    System.out.println("case A");
                    mrow = pos[0][0];
                    mcol = pos[0][1];
                    if(grid[mrow][mcol-1] == " "){
                        grid[mrow][mcol-1] = "H";
                        grid[mrow][mcol] = " ";
                        pos[0][1] = mcol-1;

                        for(int row=0; row<grid.length; row++){
                          for(int col = 0; col<grid[row].length; col++){
                            System.out.print(grid[row][col] + " ");
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("Invalid Move!");
                }
                    break;
                case 'S':
                    System.out.println("case S");
                    mrow = pos[0][0];
                    mcol = pos[0][1];
                    if(grid[mrow+1][mcol] == " "){
                        grid[mrow+1][mcol] = "H";
                        grid[mrow][mcol] = " ";
                        pos[0][0] = mrow+1;

                        for(int row=0; row<grid.length; row++){
                            for(int col = 0; col<grid[row].length; col++){
                                System.out.print(grid[row][col] + " ");
                            }
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println("Invalid Move!");
                    }
                    break;
                case 'D':
                System.out.println("case D");
                    mrow = pos[0][0];
                    mcol = pos[0][1];
                    if(grid[mrow][mcol+1] == " "){
                        grid[mrow][mcol+1] = "H";
                        grid[mrow][mcol] = " ";
                        pos[0][1] = mcol+1;

                        for(int row=0; row<grid.length; row++){
                          for(int col = 0; col<grid[row].length; col++){
                            System.out.print(grid[row][col] + " ");
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("Invalid Move!");
                }
                    
                    break;
                
            }
        }
    }
}