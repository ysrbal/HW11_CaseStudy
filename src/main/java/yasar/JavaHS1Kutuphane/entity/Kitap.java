package yasar.JavaHS1Kutuphane.entity;

import com.yasar.utility.EDurum;

import java.util.Random;

public abstract class Kitap {
    private long id;
    private String isbnCode;
    private String kitapAdi;
    private String yazar;
    private String yayinYili;
    private EDurum durum;

    private Kitap() {
        this.id = new Random().nextLong();
    }

    public Kitap(String isbnCode, String kitapAdi, String yazar, String yayinYili, EDurum durum) {
        this();
        this.isbnCode = isbnCode;
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kitap{");
        sb.append("id=").append(id);
        sb.append(", isbnCode='").append(isbnCode).append('\'');
        sb.append(", kitapAdi='").append(kitapAdi).append('\'');
        sb.append(", yazar='").append(yazar).append('\'');
        sb.append(", yayinYili='").append(yayinYili).append('\'');
        sb.append(", durum=").append(durum);
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(String yayinYili) {
        this.yayinYili = yayinYili;
    }

    public EDurum getDurum() {
        return durum;
    }

    public void setDurum(EDurum durum) {
        this.durum = durum;
    }
}
