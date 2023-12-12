import java.util.Random;
import java.util.Scanner;

public class Miine {
    int row, col, size;
    int success = 0;
    int map[][];
    int board[][];
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    boolean game = true;

    Miine(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new int[row][col];
        this.board = new int[row][col];
        this.size = row * col;
    }

    public void run() {
        prepareGame();
        print(map);
        System.out.println("OYUN BAŞLADI");
        while (game) {
            print(board);
            System.out.print("Satır:");
            int selectedRow = scanner.nextInt();
            System.out.print("Sütun:");
            int selectedCol = scanner.nextInt();

            if (selectedRow < 0 || selectedRow >= row || selectedCol < 0 || selectedCol >= col) {
                System.out.println("GEÇERSİZ KOORDİNAT");
                continue;
            }

            if (map[selectedRow][selectedCol] != -1) {
                check(selectedRow, selectedCol);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Tebrikler, oyunu kazandınız!");
                    game = false;
                }
            } else {
                game = false;
                System.out.println("Oyun BİTTİ!!");
            }
        }
    }

  public void check(int r, int c) {
    if (board[r][c] == 0) {
        if (c < col - 1 && map[r][c + 1] == -1) {
            board[r][c]++;
        }
        if (r < row - 1 && map[r + 1][c] == -1) {
            board[r][c]++;
        }
        if (r > 0 && map[r - 1][c] == -1) {
            board[r][c]++;
        }
        if (c > 0 && map[r][c - 1] == -1) {
            board[r][c]++;
        }
    }

    if (board[r][c] == 0) {
        board[r][c] = -2;
    }
}

    public void prepareGame() {
        int randRow, randCol;
        int count = 0;
        while (count != size / 4) {
            randRow = random.nextInt(row);
            randCol = random.nextInt(col);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}