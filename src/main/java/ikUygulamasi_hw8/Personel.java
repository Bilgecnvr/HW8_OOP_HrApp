package ikUygulamasi_hw8;

import java.time.LocalDate; // Doğum tarihini ve bugünün tarihini tutar
import java.time.Period; // Yaş hesaplama için kullanılır, iki tarih arasındaki farkı bulur

public abstract class Personel {
    private String ad;
    private String soyad;
    private LocalDate dogumTarihi;

    public Personel(String ad, String soyad, LocalDate dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public int yasHesapla() {
        return Period.between(dogumTarihi, LocalDate.now()).getYears();
    }

    public abstract int emekliligeKalanYil();

    public void bilgileriYazdir() {
        System.out.println(ad + " " + soyad + " (" + yasHesapla() + " yaşında)");
    }
}