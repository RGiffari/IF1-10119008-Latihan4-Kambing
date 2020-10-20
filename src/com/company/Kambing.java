package com.company;

/**
 *
 * @author
 * NAMA         : Raihan Giffari
 * KELAS        : PBO12
 * NIM          : 10119008
 * Deskripsi Program    : Program ini berisi tentang cara penjumlahan antar variabel
 *
 */

public class Kambing {

        public void tambahKambing() {
            // Deklarasi variabel lokal
            int jumlahKambing = 0;

            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah Kambing setelah ditambah: " +
                    jumlahKambing);
        }

        public static void main(String[] args) {
            Kambing kambingJantan = new Kambing();
            kambingJantan.tambahKambing();
    }
}
