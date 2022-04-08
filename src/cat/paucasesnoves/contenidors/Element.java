package cat.paucasesnoves.contenidors;


public class Element <E>{

    private E info;
    private Element seguent;

    public Element(E info, Element elementInteger) {
        this.info = info;
        this.seguent = elementInteger;
    }

    public E getInfo() {
        return info;
    }
    public void setInfo(E info) {
        this.info = info;
    }
    public Element getSeguent() {
        return seguent;
    }
    public void setSeguent(Element elementInteger) {
        this.seguent = elementInteger;
    }

    @Override
    public String toString() {
        return "ElementInteger [info=" + info + "]";
    }
}
