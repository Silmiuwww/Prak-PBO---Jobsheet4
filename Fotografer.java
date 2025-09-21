public class Fotografer {
    private String idFotografer;
    private String nama;
    private String spesialisasi;

    public Fotografer(String idFotografer, String nama, String spesialisasi) {
        this.idFotografer = idFotografer;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getIdFotografer() {
        return idFotografer;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public String getInfo() {
        return "ID: " + idFotografer +
               ", Nama: " + nama +
               ", Spesialisasi: " + spesialisasi;
    }
}
