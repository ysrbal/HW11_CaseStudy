package yasar.JavaHS1Maas.entity;

public class Memur extends Personel {
    private double mesaiUcret;

    public Memur(String name, String lastName, String unvan, double calismaSaati, double saatlikUcret) {
        super(name, lastName, unvan, calismaSaati, saatlikUcret);
    }

    @Override
    public void maasHesapla() {
        setSaatlikUcret(500);
        if (getCalismaSaati() <= 180)
            setAnaOdeme(getSaatlikUcret() * getCalismaSaati());
        else if (getCalismaSaati() > 180) {
            setMesaiUcret(getSaatlikUcret() * (getCalismaSaati() - 180));
            setToplamMaas(getAnaOdeme() + getMesaiUcret());
        }
    }

    public double getMesaiUcret() {
        return mesaiUcret;
    }

    public void setMesaiUcret(double mesaiUcret) {
        this.mesaiUcret = mesaiUcret;
    }
}
