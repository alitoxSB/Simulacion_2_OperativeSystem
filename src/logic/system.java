package logic;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class system {
    Scanner input = new Scanner(System.in);
    data_gestor dataGestor = new data_gestor();
    String player;
    Tiempo timerSystem = new Tiempo();

    public void mainMenu(int opcion) throws FileNotFoundException {

        switch (opcion){
            case 1:
                timerSystem.Contar();
                dataGestor.cargarDatos();
                dataGestor.imprimirDatos();
                timerSystem.Detener();
                System.out.println("Tiempo tardado en la consulta: " + timerSystem.getSegundos() + " segundos");

                break;
            case 2:
                System.out.println("Digite el nombre del jugador");
                player = input.nextLine();
                timerSystem.Contar();
                dataGestor.BuscarNamePlayer(player);
                System.out.println("Tiempo tardado en la consulta:" + timerSystem.getSegundos() + " segundos");
                break;
            case 3:
                System.out.println("Digite la estatura, edad o peso del jugador:");
                player = input.nextLine();
                timerSystem.Contar();
                dataGestor.BuscarEdadPesoEstaturaPlayer(player);
                System.out.println("Tiempo tardado en la consulta:" + timerSystem.getSegundos() + " segundos");
                break;
            case 4:
                System.out.println("Digite la nacionalidad que quieres buscar:");
                player = input.nextLine();
                timerSystem.Contar();
                dataGestor.BuscarPaisPlayer(player);
                System.out.println("Tiempo tardado en la consulta:" + timerSystem.getSegundos() + " segundos");
                break;
            case 5:
                System.out.println("Digite el dorsal del jugador:");
                player = input.nextLine();
                timerSystem.Contar();
                dataGestor.BuscarDorsalPlayer(player);
                System.out.println("Tiempo tardado en la consulta:" + timerSystem.getSegundos() + " segundos");
        }
    }
}
