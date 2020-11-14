package pboif2.pkg10119052.latihan60.akatsuki;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Karakter Akatsuki
 * 
 */
public class PBOIF210119052Latihan60Akatsuki {
    public String nama;
    public static void main(String[] args) {
        Akatsuki akatsuki = new AnggotaAkatsuki();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama anggota akatsuki yang ingin anda cari : ");
        akatsuki.setNama(input.next());
        System.out.println();
        akatsuki.tampil();
    }
    
}
