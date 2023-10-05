import java.util.Scanner;
public class Pemilihan2Percobaan224 {
    public static void main (String [] args){
    Scanner input24 = new Scanner(System.in);

    System.out.print("Masukkan sudut1 : ");
    float sudut1 = input24.nextInt();
    System.out.print("Masukkan sudut2 : ");
    float sudut2 = input24.nextInt();
    System.out.print("Masukkan sudut3 : ");
    float sudut3 = input24.nextInt();


    float totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if (sudut1 == sudut2 && sudut1 == sudut3) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    input24.close();
    }
}
