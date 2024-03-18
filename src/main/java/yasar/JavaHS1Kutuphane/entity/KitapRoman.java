package yasar.JavaHS1Kutuphane.entity;

import com.yasar.utility.EDurum;

public class KitapRoman extends Kitap{
    public KitapRoman(String isbnCode, String baslik, String yazar, String yayinYili, EDurum durum) {
        super(isbnCode, baslik, yazar, yayinYili, durum);
    }
}
