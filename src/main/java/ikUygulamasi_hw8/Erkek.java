package ikUygulamasi_hw8;

import java.time.LocalDate;

public class Erkek extends Personel {
    public Erkek(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emekliligeKalanYil() {
        int kalan = 65 - yasHesapla();
        return Math.max(kalan, 0);
    }
}