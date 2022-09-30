public class exit {
    int row;
    int col;
    boolean slay;

    public void spawnExit(char[][] map) {
        if (map[5][9] == 'X') {
            map[5][9] = 'L';
            row = 9;
            col = 5;

        }
        else{
            System.out.println("Error!");
        }
    }
}
