/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Melihat Kepribadian Seseorang Dari Warna
 */
import java.util.Scanner;
public class Latihan29_Warna_Kepribadian {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("\nMERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU\n");

        System.out.print("PILIH WARNA FAVORITMU: ");
        String warna = scanner.nextLine().trim().toUpperCase();

        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        System.out.println("\n====Hasil Test Kepribadian " + nama.toUpperCase() + "====");
        switch (warna) {
            case "MERAH":
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
                System.out.println("4. Menyukai Tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol");
                System.out.println("7. Memiliki energi kehangatan dan cinta");
                break;
            case "HIJAU":
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prisip,");
                System.out.println("4. Menginginkan kesempurnaan, ");
                System.out.println("5. Mudah cemburu, ");
                System.out.println("6. Mudah merasa iri, ");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.h");
                break;
            case "KUNING":
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang mrnolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain, ");
                System.out.println("7. Loyal, ");
                System.out.println("8. Hangat, ");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil, ");
                System.out.println("10. Cenderung penakut.");
                break;
            case "BIRU":
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar, ");
                System.out.println("5. Memiliki empati yang besar, ");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya, ");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            default:
                System.out.println("Oops..Belum teridentifikasi");
                break;
        }
    }
}
