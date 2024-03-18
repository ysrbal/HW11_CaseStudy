package yasar.JavaHS1Maas.entity;

import java.util.UUID;

public abstract class Personel {
    private String id;
    private String name;
    private String lastName;
    private String unvan;
    private double calismaSaati;
    private double saatlikUcret;
    private double anaOdeme;
    private double toplamMaas;


    public abstract void maasHesapla();

    private Personel() {
        this.id = UUID.randomUUID().toString();
    }

    public Personel(String name, String lastName, String unvan, double calismaSaati, double saatlikUcret) {
        this();
        this.name = name;
        this.lastName = lastName;
        this.unvan = unvan;
        this.calismaSaati = calismaSaati;
        this.saatlikUcret = saatlikUcret;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personel{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", unvan='").append(unvan).append('\'');
        sb.append(", calismaSaati=").append(calismaSaati);
        sb.append(", saatlikUcret=").append(saatlikUcret);
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public double getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(double calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public double getSaatlikUcret() {
        return saatlikUcret;
    }

    public void setSaatlikUcret(double saatlikUcret) {
        this.saatlikUcret = saatlikUcret;
    }

    public double getAnaOdeme() {
        return anaOdeme;
    }

    public void setAnaOdeme(double anaOdeme) {
        this.anaOdeme = anaOdeme;
    }

    public double getToplamMaas() {
        return toplamMaas;
    }

    public void setToplamMaas(double toplamMaas) {
        this.toplamMaas = toplamMaas;
    }
}
