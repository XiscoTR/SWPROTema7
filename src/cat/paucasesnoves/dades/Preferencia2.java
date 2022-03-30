package cat.paucasesnoves.dades;

import java.util.Objects;

public class Preferencia2 {

    private int ordre;
    private String plat;

    public Preferencia2(int ordre, String plat) {
        this.ordre = ordre;
        this.plat = plat;
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

    public Preferencia2() {
        super();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Preferencia2)) return false;
        Preferencia2 that = (Preferencia2) o;
        return getOrdre() == that.getOrdre() && getPlat().equals(that.getPlat());
    }

    public int hashCode() {
        return Objects.hash(getOrdre(), getPlat());
    }

    @Override
    public String toString() {
        return  "[ plat=" + plat + " ordre=" + ordre + "]";
    }
}