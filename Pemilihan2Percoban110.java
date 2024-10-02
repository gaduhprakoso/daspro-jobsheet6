import java.util.Scanner;

public class Pemilihan2Percoban110{
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tahun anda: ");
        int tahun = input.nextInt();

        if ((tahun % 4) == 0){
            if ((tahun % 100)== 0){
                if ((tahun % 400) == 0){
                    System.out.println("Tahun "+tahun+" adalah Tahun Kabisat");
                }else
                    System.out.println("Tahun "+tahun+" Bukan Tahun Kabisat"); 
            }else
                System.out.println("Tahun "+tahun+" Bukan Tahun Kabisat"); 
        }else
            System.out.println("Tahun "+tahun+" Bukan Tahun Kabisat");
    }
}