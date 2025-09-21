import java.time.LocalDate;
import java.util.ArrayList;

public class Klien {
    private String idKlien;
    private String nama;
    private ArrayList<SesiPemotretan> daftarSesi;

    public Klien(String idKlien, String nama) {
        this.idKlien = idKlien;
        this.nama = nama;
        this.daftarSesi = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahSesi(LocalDate tanggal, Fotografer fotografer,
                           String paket, double biaya, String status) {
        SesiPemotretan sesi = new SesiPemotretan(tanggal, paket, biaya, status, fotografer);
        daftarSesi.add(sesi);
    }

    public String getInfo() {
        String info = "";
        info += "Id Klien        : " + idKlien + "\n";
        info += "Nama            : " + nama + "\n";

        if (!daftarSesi.isEmpty()) {
            info += "Riwayat Sesi    : \n";
            for (SesiPemotretan sesi : daftarSesi) {
                info += sesi.getInfo();
            }
        }
        else {
            info += "Belum ada riwayat sesi";
        }
        info += "\n";

        return info;
    }
}
