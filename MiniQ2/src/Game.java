public class Game {
    
    char[][] map = {{'X','X','X','X','X','X','X','X','X','X'},
                    {'X',' ',' ',' ',' ',' ',' ',' ',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ',' ',' ',' ',' ',' ','X',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ','X','X',' ','X',' ','X',' ','X'},
                    {'X',' ','X','X',' ',' ',' ',' ',' ','X'},
                    {'X','X','X','X','X','X','X','X','X','X'}}; //10x10

    hero pedro;
    dragon dragon;
    sword enma;
    exit exit;

    public Game() {
        pedro = new hero();
        dragon = new dragon();
        enma = new sword();
        exit = new exit();
            
    }

    public void start(){
        pedro.spawnHero(map);
        dragon.spawnDragon(map);
        enma.spawnSword(map);
        exit.spawnExit(map);
        printMap();
        // for(int row=0; row<10; row++){
        //     for(int col = 0; col<10; col++){
        //         System.out.print(map[row][col]);
        //         System.out.print(' ');
        //     }
        //     System.out.println();
        // }
    }

    public void printMap() {
        for(int row=0; row<10; row++){
            for(int col = 0; col<10; col++){
                System.out.print(map[row][col]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }


    
}
