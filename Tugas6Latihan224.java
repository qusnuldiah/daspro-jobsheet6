import java.util.Scanner;
public class Tugas6Latihan224 {  
    public static void main (String [] args){
    Scanner input24 = new Scanner(System.in);

    System.out.print("Masukkan jenis buku : ");
    String jenisBuku = input24.nextLine();
    System.out.print("Masukkan jumlah buku yang dibeli: ");
    int jumlahBuku = input24.nextInt();
    double diskon = 0.0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else if (jumlahBuku <= 3) {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

    double totalDiskon = diskon;
    System.out.println("Total diskon: " + (totalDiskon * 100) + "%");
    input24.close();
    }
}
