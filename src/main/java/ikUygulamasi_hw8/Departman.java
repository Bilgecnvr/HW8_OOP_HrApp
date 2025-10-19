package ikUygulamasi_hw8;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String ad;
    private Personel takimLideri;
    private List<Personel> personelListesi;
    private List<String> gorevListesi;
    private List<String> tamamlananGorevler;

    public Departman(String ad, Personel takimLideri) {
        this.ad = ad;
        this.takimLideri = takimLideri;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
        this.tamamlananGorevler = new ArrayList<>();

        // Lideri personel listesine ekle
        this.personelListesi.add(takimLideri);
    }

    public void takimLideriDegistir(Personel yeniLider) {
        this.takimLideri = yeniLider;
        if (!personelListesi.contains(yeniLider)) {
            personelListesi.add(yeniLider);
        }
        System.out.println("\nTakım lideri değiştirildi: " + yeniLider.getAd() + " " + yeniLider.getSoyad());
    }

    public void personelEkle(Personel p) {
        if (!personelListesi.contains(p)) {
            personelListesi.add(p);
            System.out.println(p.getAd() + " departmana eklendi.");
        } else {
            System.out.println(p.getAd() + " zaten departmanda mevcut.");
        }
    }

    public void personelCikar(Personel p) {
        if (personelListesi.contains(p)) {
            if (p.equals(takimLideri)) {
                System.out.println("\nUyarı: Takım lideri departmandan çıkarılamaz!");
                return;
            }
            personelListesi.remove(p);
            System.out.println("\n" + p.getAd() + " " + p.getSoyad() + " departmandan çıkarıldı.");
        } else {
            System.out.println("\n" + p.getAd() + " " + p.getSoyad() + " departmanda bulunamadı.");
        }
    }

    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
        System.out.println("Görev eklendi: " + gorev);
    }

    public void gorevTamamla(String gorev) {
        if (gorevListesi.remove(gorev)) {
            tamamlananGorevler.add(gorev);
            System.out.println("\nGörev tamamlandı: " + gorev);
        } else {
            System.out.println("\nGörev bulunamadı: " + gorev);
        }
    }

    public void departmanBilgileri(String baslik) {
        System.out.println("\n--- " + baslik + " ---");
        System.out.println("Departman: " + ad);
        System.out.println("Takım Lideri: " + takimLideri.getAd() + " " + takimLideri.getSoyad());
        System.out.println("Personel Listesi:");
        for (Personel p : personelListesi) {
            System.out.println(" - " + p.getAd() + " " + p.getSoyad());
        }
        System.out.println("Aktif Görevler: " + gorevListesi);
        System.out.println("Tamamlanan Görevler: " + tamamlananGorevler);
    }
}
