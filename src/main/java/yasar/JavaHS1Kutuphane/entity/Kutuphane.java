package yasar.JavaHS1Kutuphane.entity;

import com.yasar.utility.EDurum;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    private List<Kitap> kitapList;
    private List<Uye> uyeList;

    public Kutuphane() {
        this.kitapList = new ArrayList<>();
        this.uyeList = new ArrayList<>();
    }

    public void addBook(Kitap kitap) {
        kitapList.add(kitap);
    }

    public void addMember(Uye uye) {
        uyeList.add(uye);
    }

    public List<Kitap> bookList() {
        return kitapList;
    }

    public List<Uye> uyeList() {
        return uyeList;
    }

    public void kitapOduncAl(String kitapAdi, String uyeNo) {
        Kitap kitap = kitapList.stream()
                .filter(x -> x.getKitapAdi().equalsIgnoreCase(kitapAdi))
                .findFirst().orElse(null);

        if (kitap != null && kitap.getDurum().equals(EDurum.ODUNC_ALINABILIR)) {
            Uye uye = uyeList.stream()
                    .filter(x -> x.getUyeNo() == uyeNo)
                    .findFirst().orElse(null);

            if (uyeNo != null) {
                kitap.setDurum(EDurum.ODUNC_VERILDI);
                uye.kitapOduncAl(kitap);
            }
        }
    }

    public void kitapIadeEt(String kitapAdi, String uyeNo) {
        Kitap kitap = kitapList.stream()
                .filter(x -> x.getKitapAdi().equalsIgnoreCase(kitapAdi))
                .findFirst().orElse(null);

        if (kitap != null && kitap.getDurum().equals(EDurum.ODUNC_VERILDI)) {
            Uye uye = uyeList.stream()
                    .filter(x -> x.getUyeNo() == uyeNo)
                    .findFirst().orElse(null);
            if (uye != null) {
                kitap.setDurum(EDurum.ODUNC_ALINABILIR);
                uye.kitapIadeEt(kitap);
            }
        }
    }

    public List<Kitap> mevcutKitaplariGoster() {
        return kitapList.stream()
                .filter(x -> x.getDurum().equals(EDurum.ODUNC_ALINABILIR))
                .toList();
    }

    public List<Kitap> oduncAlinanKitaplariGoster() {
        return kitapList.stream()
                .filter(x -> x.getDurum().equals(EDurum.ODUNC_VERILDI))
                .toList();
    }
}
