package yasar.JavaHS1Kutuphane.entity;

import com.yasar.utility.EDurum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Uye implements IUye<Kitap> {
    private long id;
    private String ad;
    private String soyad;
    private String uyeNo;
    private List<Kitap> oduncKitapList;

    private Uye() {
        this.id = new Random().nextLong();
    }

    public Uye(String ad, String soyad, String uyeNo) {
        this();
        this.ad = ad;
        this.soyad = soyad;
        this.uyeNo = uyeNo;
        this.oduncKitapList = new ArrayList<>();

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Uye{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", uyeNo='").append(uyeNo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(String uyeNo) {
        this.uyeNo = uyeNo;
    }

    @Override
    public void kitapOduncAl(Kitap entity) {
        entity.setDurum(EDurum.ODUNC_VERILDI);
        oduncKitapList.add(entity);
    }

    @Override
    public void kitapIadeEt(Kitap entity) {
        entity.setDurum(EDurum.ODUNC_ALINABILIR);
        oduncKitapList.remove(entity);
    }

    @Override
    public List<Kitap> oduncKitaplar() {
        return oduncKitapList;
    }
}
