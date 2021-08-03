package logic;
import java.util.Timer;
import java.util.TimerTask;
    public class Tiempo {

        private Timer timer = new Timer();
        private long segundos=0;

        //Clase interna que funciona como contador
        class Contador extends TimerTask {
            public void run() {
                segundos++;
            }
        }
        //Crea un timer, inicia segundos a 0 y comienza a contar
        public void Contar()
        {
            this.segundos=0;
            timer = new Timer();
            timer.schedule(new Contador(), (long) 0.0, 10000);
        }
        //Detiene el contador
        public void Detener() {
            timer.cancel();
        }
        //Metodo que retorna los segundos transcurridos
        public long getSegundos()
        {
            return this.segundos;
        }
    }
