import java.time.LocalDate;

public class StudioFotoDemo {
    public static void main(String[] args) {
        Fotografer rizal = new Fotografer("F001", "Riza", "Wedding");
        Fotografer dian = new Fotografer("F002", "Dian", "Family");

        Klien klien1 = new Klien("K001", "Nadia Minatul");
        klien1.tambahSesi(LocalDate.of(2023, 5, 10), rizal, "Wedding Package", 3000000, "Selesai");
        klien1.tambahSesi(LocalDate.of(2023, 6, 15), dian, "Family Package", 2000000, "Selesai");

        System.out.println(klien1.getInfo());
        System.out.println();

        Klien klien2 = new Klien("K002", "Rahma Putra");
        System.out.println(klien2.getInfo());
    }
}
