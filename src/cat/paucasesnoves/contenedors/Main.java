package cat.paucasesnoves.contenedors;

import cat.paucasesnoves.Utilitats.Errors;
import cat.paucasesnoves.dades.Preferencia;
import cat.paucasesnoves.dades.Preferencia2;
import cat.paucasesnoves.dades.Preferencia3;
import cat.paucasesnoves.Utilitats.Plats.TipusPlat;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Main p = new Main();

        System.out.println("/PilaIntegers/" + "\n");
        p.provaPilaIntegers();
        p.cadena();
        System.out.println("/PilaIntegers2/" + "\n");
        p.provaPilaIntegers2();
        p.cadena();
        System.out.println("/PilaStack/" + "\n");
        p.provaPilaStack();
        p.cadena();
        System.out.println("/PilaArrayDeque/" + "\n");
        p.provaPilaArrayDeque();
        p.cadena();
        System.out.println("/CoaArrayDeque/" + "\n");
        p.provaCoaArrayDeque();
        p.cadena();
        System.out.println("/HashSet/" + "\n");
        p.provaHashSet();
        p.cadena();
        System.out.println("/HashSet2/" + "\n");
        p.provaHashSet2();
        p.cadena();
        System.out.println("/HashMap/" + "\n");
        p.provesHasMap();
        p.cadena();
        System.out.println("/Enumeracio/" + "\n");
        p.provesEnumeracio();
        p.cadena();
        System.out.println("/Collection/" + "\n");
        p.provesCollection();
        p.cadena();
        System.out.println("/Collection/" + "\n");
        p.enumErrors();
    }


    public void provaPilaIntegers() {
        PilaInteger a = new PilaInteger();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.mostra();
        System.out.println("Muestra Integer con un return: " + a.peek());
        System.out.println("Estado de la pila: " + a.isEmpty());
        a.pop();
        a.mostra();
        System.out.println("Muestra un Integer que acaba de ser eliminado: " + a.poll());
        a.mostra();
    }

    public void provaPilaIntegers2() {
        Pila<String> a = new Pila<>();
        a.push("Rojo");
        a.push("Azul");
        a.push("Verde");
        a.push("Amarillo");
        a.mostra();
        System.out.println("Muestra un return: " + a.peek());
        System.out.println("Estado de la pila: " + a.isEmpty());
        a.pop();
        a.mostra();
        System.out.println("Muestra un elemento que acaba de ser eliminado: " + a.poll());
        a.mostra();
    }

    public void provaPilaStack() {
        Stack<Preferencia> pref = new Stack<>();
        Preferencia a = new Preferencia(1, "Pasta");
        Preferencia b = new Preferencia(2, "Carn");
        Preferencia c = new Preferencia(3, "Peix");
        System.out.println("Elemento añadido a la pila: " + pref.push(a));
        System.out.println("Elemento añadido a la pila: " + pref.push(b));
        System.out.println("Elemento añadido a la pila: " + pref.push(c));
        System.out.println("Elemento recuperado: " + pref.pop());
        System.out.println("Elemento recuperado: " + pref.peek());
        System.out.println("Pila vacia: " + pref.empty());
        System.out.println("Buscando elemento: " + pref.search(a));
    }

    public void provaPilaArrayDeque(){
        Deque<Preferencia> aq = new ArrayDeque<>();
        Preferencia a = new Preferencia(1, "Pasta");
        Preferencia b = new Preferencia(2, "Carn");
        Preferencia c = new Preferencia(3, "Peix");
        aq.add(a);
        aq.add(b);
        aq.add(c);
        System.out.println("Elemento eliminado: " + aq.remove(a));
        System.out.println("Tamaño de la cola: " + aq.size());
        System.out.println("Primer valor de la cola: " + aq.element());
        System.out.println("Cola añadido a la memoria: " + aq);
        aq.clear();
        System.out.println("Tamaño de la cola despues de un clear: " + 0);
    }

    public void provaCoaArrayDeque() {
        Queue<String> aq = new ArrayDeque<>();
        aq.add("primero");
        aq.add("segundo");
        aq.add("tercero");
        aq.add("cuarto");
        System.out.println("Elemento eliminado: " + aq.remove("primero"));
        System.out.println("Tamaño de la cola: " + aq.size());
        System.out.println("Primer valor de la cola: " + aq.element());
        System.out.println("Cola añadido a la memoria: " + aq);
        aq.clear();
        System.out.println("Tamaño de la cola despues de un clear: " + 0);
    }

    public void provaHashSet() {
        Set<Preferencia> preferencia = new HashSet<>();
        Preferencia a = new Preferencia(1, "Paella");
        Preferencia b = new Preferencia(1, "Paella");
        preferencia.add(a);
        preferencia.add(b);
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El numero de elementos es: " + preferencia.size());
        System.out.println("Elemento eliminado: " + preferencia.remove(a));
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El elemento esta vacio: " + preferencia.isEmpty());
        System.out.println("Si, ha insertado los dos objetos, es el resultado esperado porque " +
                "los valores de los objetos son iguales y la classe (Preferencia) no tiene el metodo \n" +
                "hashCode ni el metodo equals para diferenciar los dos objetos");
    }

    public void provaHashSet2() {
        Set<Preferencia2> preferencia = new HashSet<>();
        Preferencia2 a = new Preferencia2(1, "Paella");
        Preferencia2 b = new Preferencia2(1, "Paella");
        preferencia.add(a);
        preferencia.add(b);
        System.out.println("Codigo hash: " + a.hashCode());
        System.out.println("Codigo hash: " + b.hashCode());
        System.out.println("Comparar si los dos objetos son iguales: " + a.equals(b));
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El numero de elementos es: " + preferencia.size());
        System.out.println("Elemento eliminado: " + preferencia.remove(a));
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El elemento esta vacio: " + preferencia.isEmpty());
        System.out.println("El resultado obtenido no es el mismo ya que el segundo objeto no se ha añadido " +
                ", si cambio el valor de los atributos del objeto (b) el codigo Hash cambia y si que se añade el objeto");

    }

    public void provesHasMap(){
        HashMap<Integer, Preferencia2> mapaPreferencia = new HashMap<>();
        Preferencia2 a = new Preferencia2(1, "Paella");
        Preferencia2 b = new Preferencia2(2, "Peix");
        Preferencia2 c = new Preferencia2(3, "Carn");
        Preferencia2 d = new Preferencia2(3, "Carn");
        mapaPreferencia.put(1, a);
        mapaPreferencia.put(2, b);
        mapaPreferencia.put(3, c);
        System.out.println("El elemento se ha añadido: " + mapaPreferencia.put(4, d));
        System.out.println("El elemento existe por clave: " + mapaPreferencia.containsKey(2));
        System.out.println("El elemento existe por valor: " + mapaPreferencia.containsValue(d));
        System.out.println("Obtener el elemento por clave: " + mapaPreferencia.get(1));
        for (Preferencia2 valor:mapaPreferencia.values()) {
            System.out.print(valor + "\t");
        }
        System.out.println("\n" + "El tamaño del HashMap es: " + mapaPreferencia.size());
        System.out.println("Elemento eliminado: " +mapaPreferencia.remove(4));
        System.out.println("El elemento esta vacio: " + mapaPreferencia.isEmpty());
    }

    public void provesEnumeracio(){
        ArrayList <Preferencia3> menu = new ArrayList<>();
        Preferencia3 a = new Preferencia3(1, "Croquetes" , TipusPlat.Entrants);
        Preferencia3 b = new Preferencia3(2, "Frit" , TipusPlat.Entrants);
        Preferencia3 c = new Preferencia3(3, "Paella" , TipusPlat.Principal);
        Preferencia3 d = new Preferencia3(4, "Pit de pollastre" , TipusPlat.Principal);
        Preferencia3 e = new Preferencia3(5, "Calamars" , TipusPlat.Segon);
        Preferencia3 f = new Preferencia3(6, "Sopa" , TipusPlat.Segon);
        Preferencia3 g = new Preferencia3(7, "Tarta de formatge" , TipusPlat.Postre);
        Preferencia3 h = new Preferencia3(8, "Tiramisú" , TipusPlat.Postre);
        menu.add(a);
        menu.add(b);
        menu.add(c);
        menu.add(d);
        menu.add(e);
        menu.add(f);
        menu.add(g);
        menu.add(h);
        System.out.println("Tots els posibles tipus de plats");
        for (TipusPlat tipus : TipusPlat.values()) {
            System.out.println(tipus);
        }
        for (int i= 0; i < menu.size(); i++) {
            if(menu.get(i).getTipus().equals(TipusPlat.Entrants)){
                System.out.println(menu.get(i).toString());
            }
        }
        System.out.println("\n");
        for (int i= 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getPlat());
        }
    }

    public void provesCollection(){
        ArrayList <String> ordenar = new ArrayList<>();
        ordenar.add("A");
        ordenar.add("B");
        ordenar.add("C");
        ordenar.add("D");
        ordenar.add("E");
        ordenar.add("F");
        ordenar.add("G");

        Collections.shuffle(ordenar);
        System.out.println("ArrayList desordenada: " +ordenar);
        System.out.println("Maximo del ArrayList: " + "[" + Collections.max(ordenar) + "]");
        System.out.println("Minimo del ArrayList: " + "[" + Collections.min(ordenar) + "]");
        Collections.sort(ordenar, Collections.reverseOrder());
        System.out.println("ArrayList ordenada al reves: " + ordenar);
        Collections.sort(ordenar);
        System.out.println("ArrayList ordenada: " + ordenar);
        System.out.println("Mostrar la posición de un elemento: " + Collections.binarySearch(ordenar, "G"));
    }

    public void enumErrors(){
        System.out.println(Errors.TipusError.get(0).getMessage() + ", " + Errors.TipusError.get(0).getCode());
        System.out.println(Errors.TipusError.get(1).getMessage() + ", " + Errors.TipusError.get(1).getCode());
        System.out.println(Errors.TipusError.get(-1).getMessage() + ", " + Errors.TipusError.get(-1).getCode());
    }

    public void cadena(){
        System.out.println("\n" + "------------------------");
    }

}
