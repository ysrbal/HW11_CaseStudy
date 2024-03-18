package yasar.JavaHS1Kutuphane.entity;

import com.yasar.utility.EDurum;

public class KitapTarih extends Kitap{
    public KitapTarih(String isbnCode, String baslik, String yazar, String yayinYili, EDurum durum) {
        super(isbnCode, baslik, yazar, yayinYili, durum);
    }
}
