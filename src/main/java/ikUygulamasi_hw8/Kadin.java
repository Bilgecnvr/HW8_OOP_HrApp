package ikUygulamasi_hw8;

import java.time.LocalDate;

public class Kadin extends Personel {
    public Kadin(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emekliligeKalanYil() {
        int kalan = 60 - yasHesapla();
        return Math.max(kalan, 0);
    }
}