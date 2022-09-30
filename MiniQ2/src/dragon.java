public class dragon {
    int row;
    int col;

    public void spawnDragon(char[][] map) {
        if (map[3][1] == ' ') {
            map[3][1] = 'D';
            row = 3;
            col = 1;
            
        }
        else{
            System.out.println("Error Spawning Dragon, (un)lucky you");
        }
    }
}
