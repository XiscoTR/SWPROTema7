package cat.paucasesnoves.contenedors;

import cat.paucasesnoves.dades.Preferencia;
import cat.paucasesnoves.dades.Preferencia2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Main p = new Main();
        System.out.println("/PilaIntegers2/" + "\n");
        p.provaPilaIntegers2();
        System.out.println("\n" + "------------------------");
        System.out.println("/PilaIntegers/" + "\n");
        p.provaPilaIntegers();
        System.out.println("\n" + "------------------------");
        System.out.println("/PilaStack/" + "\n");
        p.provaPilaStack();
        System.out.println("\n" + "------------------------");
        System.out.println("/CoaArrayDeque/" + "\n");
        p.provaCoaArrayDeque();
        System.out.println("\n" + "------------------------");
        System.out.println("/HashSet/" + "\n");
        p.provaHashSet();
        System.out.println("\n" + "------------------------");
        System.out.println("/HashSet2/" + "\n");
        p.provaHashSet2();
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

    public void provaPilaStack() {
        Stack<Preferencia> pref = new Stack<>();
        Preferencia a = new Preferencia(1, "Pasta");
        Preferencia b = new Preferencia(2, "Carn");
        Preferencia c = new Preferencia(3, "Peix");
        System.out.println(pref.push(a));
        System.out.println(pref.push(b));
        System.out.println(pref.push(c));
        System.out.println(pref.pop());
        System.out.println(pref.peek());
        System.out.println(pref.empty());
        System.out.println(pref.search(a));
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
        System.out.println("Si, ha insertado los dos objetos, es el resultado esperado porque " +
                "los valores de los objetos son iguales y la classe (Preferencia) no tiene el metodo hashCode para diferenciar los dos" +
                " objetos");
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El numero de elementos es: " + preferencia.size());
        System.out.println("Elemento eliminado: " + preferencia.remove(a));
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El elemento esta vacio: " + preferencia.isEmpty());
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
        System.out.println("El resultado obtenido no es el mismo ya que el segundo objeto no se ha añadido " +
                ", si cambio el valor de los atributos del objeto (b) el codigo Hash cambia y si que se añade el objeto");
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El numero de elementos es: " + preferencia.size());
        System.out.println("Elemento eliminado: " + preferencia.remove(a));
        System.out.println("El elemento existe: " + preferencia.contains(a));
        System.out.println("El elemento esta vacio: " + preferencia.isEmpty());

    }

}
