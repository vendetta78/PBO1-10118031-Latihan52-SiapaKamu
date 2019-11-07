package pbo1.pkg10118031.latihan52.siapakamu;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program untuk menentukan Siapa Kamu
 */
public class PBO110118031Latihan52SiapaKamu {

    public static void main(String[] args) {

        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118031");
        System.out.println("\nNIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.setNama("Rizki Aria Putra");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO1");
        mahasiswa.kelasApa();
    }

}
