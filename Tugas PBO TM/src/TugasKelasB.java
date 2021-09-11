import java.util.Scanner;
public class TugasKelasB {
    public static void main(String[] args) {
        System.out.println("Program untuk menghitung volume balok");
        System.out.println("-------------------------------------");

        Scanner input = new Scanner(System.in);
        float panjang, lebar, tinggi, hasil;

        System.out.print("Masukkan Panjang Balok(cm): ");
        panjang = input.nextFloat();
        System.out.print("Masukkan Lebar balok(cm): ");
        lebar = input.nextFloat();
        System.out.print("Masukkan Tinggi Balok(cm): ");
        tinggi = input.nextFloat();

        // hitung volume balok;
        hasil =  (panjang*lebar*tinggi);

        System.out.println("Volume balok adalah: " + hasil + " cm");
    }
}
