package cat.paucasesnoves.dades;

import cat.paucasesnoves.Utilitats.Plats;

import java.util.Objects;

public class Preferencia3 {

    private int ordre;
    private String plat;
    private Plats.TipusPlat tipus;

    public Preferencia3(int ordre, String plat, Plats.TipusPlat tipus) {
        this.ordre = ordre;
        this.plat = plat;
        this.tipus = tipus;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public Plats.TipusPlat getTipus() {
        return tipus;
    }

    public Preferencia3() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Preferencia3)) return false;
        Preferencia3 that = (Preferencia3) o;
        return getOrdre() == that.getOrdre() && getPlat().equals(that.getPlat()) && getTipus() == that.getTipus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrdre(), getPlat(), getTipus());
    }

    @Override
    public String toString() {
        return "Preferencia3{" +
                "ordre=" + ordre +
                ", plat='" + plat + '\'' +
                ", tipus=" + tipus +
                '}';
    }
}


