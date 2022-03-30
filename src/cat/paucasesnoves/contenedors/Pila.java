package cat.paucasesnoves.contenedors;

public class Pila <P>{

    private Element iniciPila;

    public Pila() {
        iniciPila = null;
    }

    public void mostra() {
        Element actual = iniciPila;
        while(actual != null) {
            System.out.println(actual.getInfo());
            actual = actual.getSeguent();
        }
    }

    public void push(P x) {
        Element a = new Element(x, iniciPila);
        iniciPila = a;
    }

    public P peek() {
        if (iniciPila == null) {
            return null;
        }
        return (P) iniciPila.getInfo();
    }

    public void pop() {
        if (iniciPila != null) {
            iniciPila = iniciPila.getSeguent();
        }
    }

    public boolean isEmpty() {
        return iniciPila == null;
    }

    public P poll() {
        P a = peek();
        pop();
        return a;
    }
}
