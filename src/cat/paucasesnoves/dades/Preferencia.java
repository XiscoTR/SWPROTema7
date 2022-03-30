package cat.paucasesnoves.dades;

public class Preferencia {

    private int ordre;
    private String plat;

    public Preferencia(int ordre, String plat) {
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

    public Preferencia() {
        super();
    }

    @Override
    public String toString() {
        return  "[ plat=" + plat + " ordre=" + ordre + "]";
    }
}

