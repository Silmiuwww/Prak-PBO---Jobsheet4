import java.time.LocalDate;

public class SesiPemotretan {
    private LocalDate tanggalSesi;
    private String jenisPackage;
    private double totalBiaya;
    private String statusSesi;
    private Fotografer fotografer;

    public SesiPemotretan(LocalDate tanggalSesi, String jenisPackage, double totalBiaya, String statusSesi, Fotografer fotografer) {
        this.tanggalSesi = tanggalSesi;
        this.jenisPackage = jenisPackage;
        this.totalBiaya = totalBiaya;
        this.statusSesi = statusSesi;
        this.fotografer = fotografer;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggalSesi;
        info += ", Paket: " + jenisPackage;
        info += ", Fotografer: " + fotografer.getNama() + " (" + fotografer.getIdFotografer() + ")";
        info += ", Biaya: Rp" + totalBiaya;
        info += ", Status: " + statusSesi;
        info += "\n";

        return info;
    }
}
