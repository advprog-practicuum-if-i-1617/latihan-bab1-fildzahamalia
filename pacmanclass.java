package pacman1;

public class pacmanclass {

    int kanan, kiri, atas, bawah;
    int i, j, y = 1, x = 1;
    int a = 0, b = 0, c = 0, p;
    String[][] pacman = new String[10][10];
    private int point = 0;

    public void turnLeft() {
        p = x;
        p--;
        if (y == 0 || y == 9 || p == 0 || p == 9 || y == 2 && (p == 6 || p == 7 || p == 8) || y == 4 && (p == 1) || y == 5 && (p == 8) || y == 7 && (p == 1 || p == 2 || p == 3 || p == 6) || y == 8 && p == 6) {
            p++;
        } else {
            x--;
        }
    }

    public void turnRight() {
        p = x;
        p++;
        if (y == 0 || y == 9 || p == 0 || p == 9 || y == 2 && (p == 6 || p == 7 || p == 8) || y == 4 && (p == 1) || y == 5 && (p == 8) || y == 7 && (p == 1 || p == 2 || p == 3 || p == 6) || y == 8 && p == 6) {
            p--;
        } else {
            x++;
        }
    }

    public void turnUp() {
        p = y;
        p--;
        if (p == 0 || p == 9 || x == 0 || x == 9 || p == 2 && (x == 6 || x == 7 || x == 8) || p == 4 && (x == 1) || p == 5 && (x == 8) || p == 7 && (x == 1 || x == 2 || x == 3 || x == 6) || p == 8 && x == 6) {
            p++;
        } else {
            y--;
        }
    }

    public void turnDown() {
        p = y;
        p++;
        if (p == 0 || p == 9 || x == 0 || x == 9 || p == 2 && (x == 6 || x == 7 || x == 8) || p == 4 && (x == 1) || p == 5 && (x == 8) || p == 7 && (x == 1 || x == 2 || x == 3 || x == 6) || p == 8 && x == 6) {
            p--;
        } else {
            y++;
        }
    }

    public void displayArea() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 9 || i == 2 && (j == 6 || j == 7 || j == 8) || i == 4 && (j == 1) || i == 5 && (j == 8) || i == 7 && (j == 1 || j == 2 || j == 3 || j == 6) || i == 8 && j == 6) {
                    pacman[i][j] = "#";
                } else if (i == 3 && j == 3 || i == 7 && j == 7) {
                    pacman[i][j] = "@";
                } else {
                    pacman[i][j] = " ";
                }
                if (i == y && j == x) {
                    pacman[i][j] = "<";
                }
                if (x == 3 && y == 3) {
                    a = 1;
                } else if (a == 1) {
                    pacman[3][3] = " ";
                }
                if (x == 7 && y == 7) {
                    b = 1;
                } else if (b == 1) {
                    pacman[7][7] = " ";
                }
                System.out.print(pacman[i][j]);
            }
            System.out.println("");
            if (a > 0 && b > 0) {
                System.out.println("You win.");
                System.exit(0);
            }
        }
    }

}
