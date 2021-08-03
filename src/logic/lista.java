package logic;
import objects.player;

public class lista {
    private nodo Inicio = null;
    private nodo Final = null;

    public boolean ListaVacia(){
        return Inicio == null;
    }

    public void Agregar(player producto){
        nodo nuevoNodo;

        if (ListaVacia()){
            nuevoNodo = new nodo(producto);
            nodo Inicio = nuevoNodo;
        }else{
            nuevoNodo = new nodo(producto);
            Final.setNext(nuevoNodo);
        }

    }
    public void ImprimirLista(){
        if(ListaVacia()){
            System.out.println("La lista esta vacia");
        }else{
            nodo Temporal = Inicio;
            while(Temporal != null){
                System.out.println("El nodo es " + Temporal.Value);
                Temporal = Temporal.Next;
            }
        }

    }
}
