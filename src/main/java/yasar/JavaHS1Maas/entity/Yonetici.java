package yasar.JavaHS1Maas.entity;

import java.util.Random;

public class Yonetici extends Personel {
    private double bonusOdeme;


    public Yonetici(String name, String lastName, String unvan, double calismaSaati, double saatlikUcret) {
        super(name, lastName, unvan, calismaSaati, saatlikUcret);
        this.bonusOdeme = new Random().nextDouble(1_000, 10_001);
    }

    @Override
    public void maasHesapla() {
        if (this.getSaatlikUcret() < 500) {
            setSaatlikUcret(500);
        }
        setAnaOdeme(getCalismaSaati() * getSaatlikUcret());
        setToplamMaas(getAnaOdeme() + getBonusOdeme());
    }

    public double getBonusOdeme() {
        return bonusOdeme;
    }

    public void setBonusOdeme(double bonusOdeme) {
        this.bonusOdeme = bonusOdeme;
    }
}
