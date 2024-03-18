package yasar.JavaHS1Maas.entity;

import com.google.gson.Gson;
import com.yasar.utility.EAylar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MaasBordro {
    private Personel personel;
    private List<Personel> azCalisanPersonelList;


    public void maasBordro() {
        try {
            Gson gson = new Gson();
            BufferedWriter bf = new BufferedWriter(new FileWriter("MemurBordro.json"));
            if (personel.getUnvan().equals("Memur")) {
                Memur personel1 = new Memur(personel.getName(), personel.getLastName(), personel.getUnvan(), personel.getCalismaSaati(), personel.getSaatlikUcret());
                System.out.println("Maaş Bordro," + EAylar.SUBAT + "2020");
                System.out.println("======================================");
                System.out.println("Personel İsmi:" + personel1.getName());
                System.out.println("Çalışma Saati:" + personel1.getCalismaSaati());
                System.out.println("Ana Odeme:" + personel1.getAnaOdeme());
                System.out.println("Mesai:" + personel1.getMesaiUcret());
                System.out.println("======================================");
                System.out.println("Toplam Ödeme:" + personel1.getToplamMaas());
                System.out.println("======================================");

                gson.toJson(personel1, bf);
                bf.flush();
            } else if (personel.getUnvan().equals("Yonetici")) {
                Yonetici personel2 = new Yonetici(personel.getName(), personel.getLastName(), personel.getUnvan(), personel.getCalismaSaati(), personel.getSaatlikUcret());
                System.out.println("Maaş Bordro," + EAylar.SUBAT + "2020");
                System.out.println("======================================");
                System.out.println("Personel İsmi:" + personel2.getName());
                System.out.println("Çalışma Saati:" + personel2.getCalismaSaati());
                System.out.println("Ana Odeme:" + personel2.getAnaOdeme());
                System.out.println("Mesai:" + personel2.getBonusOdeme());
                System.out.println("======================================");
                System.out.println("Toplam Ödeme:" + personel2.getToplamMaas());
                System.out.println("======================================");

                gson.toJson(personel2, bf);
                bf.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Personel> azCalisanPersonelList() {
        if (personel.getCalismaSaati() < 10) {
            azCalisanPersonelList.add(personel);
        }
        return azCalisanPersonelList;
    }

}
