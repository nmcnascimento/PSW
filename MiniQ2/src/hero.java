public class hero {
    int row;
    int col;
    boolean armed;

    public void spawnHero(char[][] map) {
        if (map[1][1] == ' ') {
            map[1][1] = 'P';
            row = 1;
            col = 1;
        }
        else{
            System.out.println("Error Spawning Hero aka Pedrocas420 :'(");
        }
    }

}
