import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Mayın Tarlası oyununa hoşgeldiniz!");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır: ");
        int row = scanner.nextInt();
        System.out.print("Sütun: ");
        int col = scanner.nextInt();
        Miine mineGame = new Miine(row, col);
        mineGame.run();
    }
}