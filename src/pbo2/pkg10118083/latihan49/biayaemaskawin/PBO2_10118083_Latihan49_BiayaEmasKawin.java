/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan49.biayaemaskawin;
import java.util.Scanner;
/**
 *
 * @author  
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas: Biaya Emas Kawin
 */
public class PBO2_10118083_Latihan49_BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        MasKawin mk = new MasKawin();
        
        System.out.println("===== Hitung Biaya Emas Kawin =====");
        System.out.println("Masukan Harga Emas per Gram : Rp. " );
        mk.setHarga(scanner.nextDouble());
        System.out.println("Masukan Berat Emas yang dibeli : ");
        mk.setBerat(scanner.nextDouble());
        System.out.println("Total Harga yang harus dibayar adalah : Rp. " + mk.hitungMasKawin());
    }
    
}
