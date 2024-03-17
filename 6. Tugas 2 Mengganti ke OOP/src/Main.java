import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean tambahLagi = true;

        while (tambahLagi) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Tambah lagi? (y/t): ");
            String tambah = scanner.nextLine();
            tambahLagi = tambah.equalsIgnoreCase("y");
        }

        System.out.println("==================================");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getAlamat());
        }
    }
}