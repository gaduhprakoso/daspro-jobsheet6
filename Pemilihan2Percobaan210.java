import java.util.Scanner;

public class Pemilihan2Percobaan210 {
    public static void main(String[] args) {
        Scanner input10 =  new Scanner(System.in);
    
        //variabel
        int pilihan_menu;
        String member, metode_pembayaran;
        double harga, diskon, total_bayar;
    
        //menampilkan menu
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukan angka dari menu yang dipilih = ");
    
        //kode input
        pilihan_menu = input10.nextInt();
        input10.nextLine();
        System.out.print("apakah punya member (y/n) ? = ");
        member = input10.nextLine();
        System.out.print("apakah menggunakan QRIS (y/n) ? = ");
        metode_pembayaran = input10.nextLine();
        System.out.println("--------------------------------------");
       
        if (member.equals("y")) {//menggunakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl ="+ harga);
                
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " +harga);
    
            }else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " +harga);
    
            }else {
                System.out.println("Masukan pilihan menu dengan benar");
                return; //menghentikan eksekusi lebih lanjut jika pilihan salah
            }
    
            //menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " +total_bayar);
            
            //menghitung jika menggunakan QRIS atau tidak

            if (metode_pembayaran.equalsIgnoreCase("y")) {
                total_bayar -= 1000;
                System.out.println("dapat Potongan Rp. 1.000 karena menggunakan QRIS");
            }else if (metode_pembayaran.equalsIgnoreCase("n")){
        
            }else{
                System.out.println("masukan tidak valid");
                return;
            }
            // Menampilkan total akhir
            System.out.println("Total bayar akhir = " + total_bayar);
    
    
        }else if (member.equals("n")) {//menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl ="+ harga);
                
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " +harga);
    
            }else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " +harga);
    
            }else {
                System.out.println("Masukan pilihan menu dengan benar");
                return; //menghentikan eksekusi lebih lanjut jika pilihan salah
            }
    
            //menghitung total bayar
            total_bayar = harga ;
            System.out.println("Total bayar setelah diskon = " +total_bayar);

            //menghitung jika menggunakan QRIS atau tidak
    
            if (metode_pembayaran.equalsIgnoreCase("y")) {
                total_bayar -= 1000;
                System.out.println("dapat Potongan Rp. 1.000 karena menggunakan QRIS");
            }else if (metode_pembayaran.equalsIgnoreCase("n")){
        
            }else{
                    System.out.println("masukan tidak valid");
                    return;
            }
            // Menampilkan total akhir
            System.out.println("Total bayar akhir = " + total_bayar);
                
            }else {
                System.out.println("Member tidak valid ");
            }
            System.out.println("--------------------------------------");
     }
 }
    