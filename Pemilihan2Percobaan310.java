import java.util.Scanner;

public class Pemilihan2Percobaan310 {
    public static void main(String[] args) {
        Scanner input10 =  new Scanner(System.in);

        //variabel
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        //kode input
        System.out.print("masukan kategori : ");
        kategori = input10.nextLine();
        System.out.print("masukan besaran penghasilan : ");
        penghasilan = input10.nextInt();
    
        //kode pengecekan kategori, penghasilan dan pajak
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if(penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan-(pajak *penghasilan));
            System.out.println("penghasilan bersih : "+gajiBersih);

        }else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if(penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan-(pajak *penghasilan));
            System.out.println("penghasilan bersih : "+gajiBersih);

        }else
            System.out.println("masukan kategori salah");
    }
}
