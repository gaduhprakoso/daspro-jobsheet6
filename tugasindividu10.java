import java.util.Scanner;

public class tugasindividu10 {
    public static void main(String[] args) {

        Scanner input10 = new Scanner(System.in);

        //variabel
        String jenisBuku;
        double hargaBuku = 20000, diskon;
        int jumlahBuku;

        //kode input jenis dan jumlah buku 
        System.out.print("masukan jenis buku : ");
        jenisBuku = input10.nextLine();
        System.out.print("masukan jumlah buku : ");
        jumlahBuku = input10.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            }else{
                diskon = 0.1;
            }
        }else if (jenisBuku.equalsIgnoreCase("novel")){
            if (jumlahBuku > 3) {
                diskon = 0.09;
            }else{
                diskon = 0.08;
            }
        }else{
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }else{
                diskon = 0;
            }
        }
        //kode menghitung diskon dan total bayar
        double totalDiskon = (hargaBuku*jumlahBuku*diskon);
        double totalBayar = (hargaBuku*jumlahBuku)-totalDiskon;

        //menampilkan harga awal, diskon dan harga akhir
        System.out.println("harga awal anda = Rp."+(hargaBuku*jumlahBuku));
        System.out.println("diskon anda = Rp."+totalDiskon);
        System.out.println("harga akhir anda = Rp."+totalBayar);
    }
}