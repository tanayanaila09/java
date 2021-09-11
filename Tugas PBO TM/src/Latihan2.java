import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
    //Buatlah program Java untuk menampilkan nilai huruf berdasar nilai angka

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int Nilai = sc.nextInt();
        String Huruf;

        if (Nilai>=80){
            Huruf = "A";
        }
        else if ((Nilai>=70) && (Nilai<=80)) {
            Huruf = "B";
        }
        else if ((Nilai>=60) && (Nilai<=70)) {
            Huruf = "C";
        }
        else if ((Nilai>=50) && (Nilai<=60)) {
            Huruf = "D";
        }
        else if (Nilai<=50) {
            Huruf = "E";
        }
        else {
            Huruf = "Inputan Salah";
        }

        System.out.println("Nilai Huruf adalah " + Huruf);

    }
}
