// N : y + 1
// S : y - 1
// W : x - 1
// W : x + 1

public class ShortestPath {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for(int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if(dir == 'S') {    // SOUTH : Y - 1
                y--;
            } else if(dir == 'N') { // NORTH : Y + 1
                y++;
            } else if(dir == 'W') { // WEST : X - 1
                x--;
            } else {    // EAST : X + 1
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float)Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path distance is " + getShortestPath(path));
    }
}