import java.util.Scanner;

public class Percobaan1 {
    public static void main (String[] args) {
        Scanner input29 = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = input29.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.print("Tahun Kabisat");
        } else
            System.out.print("Bukan Tahun Kabisat");
    }
}