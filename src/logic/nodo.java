package logic;
import objects.player;

public class nodo {

    public nodo vacio;
    public player Value;
    public nodo Next;

    public nodo(player producto) {
    }

    public nodo getVacio() {
        return vacio;
    }

    public void setVacio(nodo vacio) {
        this.vacio = vacio;
    }

    public player getValue() {
        return Value;
    }

    public void setValue(player value) {
        Value = value;
    }

    public nodo getNext() {
        return Next;
    }

    public void setNext(nodo next) {
        Next = next;
    }
}