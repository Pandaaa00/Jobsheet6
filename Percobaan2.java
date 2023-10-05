import java.util.Scanner;

public class Percobaan2 {
    public static void main (String[] args) {
        Scanner input29 = new Scanner(System.in);

        System.out.print("Masukkan Sudut 1: ");
        int sudut1 = input29.nextInt();
        System.out.print("Masukkan Sudut 2: ");
        int sudut2 = input29.nextInt();
        System.out.print("Masukkan Sudut 3: ");
        int sudut3 = input29.nextInt();
        System.out.print("Masukkan Total Sudut: ");
        int totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println(totalSudut);

        if (sudut1 == sudut2 && sudut2 == sudut3) {
            System.out.println("Segitiga ini adalah segitiga sama sisi.");
        } else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3) {
            System.out.println("Segitiga ini adalah segitiga sama kaki");
        } else {
            System.out.println("Segitiga ini adalah segitiga sembarang");
        }
        if (totalSudut == 180){
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
        System.out.println("Segitiga tsb adalah segitiga siku-siku");
        else
                System.out.println("Segitiga tsb bukan segitiga siku-siku");
    }
    }
    }
