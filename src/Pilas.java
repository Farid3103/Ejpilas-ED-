
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1059237155
 */
public class Pilas {
       public LinkedList lista = new LinkedList();

    public void push(Caja o) {
        lista.addFirst(o);
    }

    public Object top() {
        return lista.getFirst();
    }

    public Object pop() {
        if (lista.isEmpty()) {
            System.out.println("");
            return "---LISTA VACIA---";
        } else {
            Caja el = (Caja) lista.removeFirst();
           // Elemento elRecuperado=(Elemento) lista.removeFirst();
           // Elemento elRecup=(Elemento) lista.removeFirst();
            return " Elemento Desapilado. Serial:" + el.getDestinatario()+ el.getDestinatario()+ el.getCodigo();
        }

    }

    public int size() {
        return lista.size();
    }

    void ListarTodo() {
        System.out.println("***Listando  Elementos de la pila***");
        System.out.println(" (cabecera)");
        for (Object o : lista) {
            Caja elRecuperado = (Caja) o;
            System.out.println("Codigo unico:" + elRecuperado.getCodigo()
                    + "  Destinatario:" + elRecuperado.getDestinatario()
            + "Ciudad:" + elRecuperado.getCiudad());
        }
    }
}

