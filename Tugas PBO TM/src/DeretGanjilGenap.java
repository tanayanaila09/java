import java.util.Scanner;

public class DeretGanjilGenap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan digit angka:");
        int iniVariabel = sc.nextInt();
        int VariabelTampung = 0;

        //Genap
        System.out.print("Ini deret genap: ");
        for (int count = 0; count < iniVariabel; count++){
            if (VariabelTampung % 2 == 0){
                System.out.print(VariabelTampung + ", ");
            }
            else {
                count--;
            }
            VariabelTampung++;
        }
        System.out.println();

        //Ganjil
        VariabelTampung = 0;
        System.out.print("Ini deret ganjil: ");
        for (int count = 0; count < iniVariabel; count++){
            if (VariabelTampung % 2 != 0){
                System.out.print(VariabelTampung + ", ");
            }
            else {
                count--;
            }
            VariabelTampung++;
        }
    }
}
