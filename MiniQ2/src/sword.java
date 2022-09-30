public class sword {
    int row;
    int col;

    public void spawnSword(char[][] map) {
        if (map[8][1] == ' ') {
            map[8][1] = 'S';
            row = 8;
            col = 1;
        }
        else{
            System.out.println("Error Spawning Hero aka Pedrocas420 :'(");
        }
    }
}
