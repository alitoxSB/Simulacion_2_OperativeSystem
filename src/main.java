import ui.msg;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import logic.system;
public class main {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        msg message = new msg();
        system system = new system();
        int opcion = 0;
        do{
            System.out.println(message.menuPrincipal());
            opcion = input.nextInt();
            system.mainMenu(opcion);
        }while(opcion!=6);
    }
}