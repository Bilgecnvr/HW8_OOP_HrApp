package ikUygulamasi_hw8;

import java.time.LocalDate;

public class IkTest {
    public static void main(String[] args) {

        // Takım lideri oluştur
        Erkek lider = new Erkek("Ahmet", "Yılmaz", LocalDate.of(1980, 5, 12));

        // Departman oluştur
        Departman yazilim = new Departman("Yazılım", lider);

        // Personelleri oluştur
        Kadin p1 = new Kadin("Ayşe", "Kara", LocalDate.of(1995, 3, 10));
        Erkek p2 = new Erkek("Mehmet", "Demir", LocalDate.of(1990, 7, 25));

        // Personel ekle
        yazilim.personelEkle(p1);
        yazilim.personelEkle(p2);

        // Görev ekle
        yazilim.gorevEkle("Test otomasyon senaryosu yazmak");
        yazilim.gorevEkle("Haberleşme kontrolü");

        // Başlangıç departman bilgileri
        yazilim.departmanBilgileri("Departman Bilgileri");

        // Emeklilik bilgileri
        System.out.println("\n--- Emeklilik Bilgileri ---");
        System.out.println(p1.getAd() + " kalan yıl: " + p1.emekliligeKalanYil());
        System.out.println(p2.getAd() + " kalan yıl: " + p2.emekliligeKalanYil());
        System.out.println(lider.getAd() + " kalan yıl: " + lider.emekliligeKalanYil());

        // Görev tamamlama, lider değişimi ve personel çıkarma
        yazilim.gorevTamamla("Test otomasyon senaryosu yazmak");
        yazilim.takimLideriDegistir(p1);
        yazilim.personelCikar(p2);

        // Güncel departman bilgileri
        yazilim.departmanBilgileri("Güncel Departman Bilgileri");
    }
}
