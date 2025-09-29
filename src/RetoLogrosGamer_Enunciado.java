import static java.lang.Math.max;

public class RetoLogrosGamer_Enunciado {


    public static void main(String[] args) {

        //Variables
        String juego = "Lol";
        int kills = 16;
        int muertes = 2;
        int asistencias = 3;
        int tiempoMin = 25;
        int objetivos = 1;
        boolean desconexion = true;
        int danoHecho = 18000;
        int danoRecibido = 6000;
        int oro = 2300;
        double KDA = ((kills + asistencias) / max(1, muertes));


        //Imprimir valores
        System.out.println("Juego: " + juego);
        System.out.println("KDA = " + KDA);


        //Comprobar si tuvo RQ y dar logro negativo
        boolean tuvoRq = (desconexion && tiempoMin < 5);
        if (tuvoRq) {
            System.out.println("Logro NEGATIVO: Rage Quit \uD83D\uDE20");
        }

        //Comprobar que nivel de jugador se le da
        if (KDA >= 5 && !tuvoRq) {
            System.out.println("Jugador PRO");
        } else if (KDA >= 3) {
            System.out.println("Jugador BUENO");
        } else if (KDA >= 1) {
            System.out.println("Jugador NORMAL");
        } else {
            System.out.println("Jugador NOOB");
        }

        if (muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2) {
            System.out.println("Partida inválida: AFK");
        } else if (kills >= 10) {
            System.out.println("Logro: Cazador experto \uD83C\uDFF9");
        } else if (muertes == 0 && kills >= 5) {
            System.out.println("Logro: Intocable \uD83D\uDC51");
        } else if (tiempoMin > 60) {
            System.out.println("Logro: Maratón gamer ⏱\uFE0F");
        } else if (danoHecho > (danoRecibido * 2)) {
            System.out.println("Logro: Dominio total \uD83D\uDCA5");
        } else if (objetivos >= 3) {
            System.out.println("Logro: Objetivos de mapa \uD83C\uDFAF");
        }


        if (juego.equals("Fortnite")) {
            if (kills >= 15 && muertes <= 2) {
                System.out.println("Victoria agresiva 🔫");
            }
            if (oro >= 2000) {
                System.out.println("Ahorrista de V-Bucks 💰");
            }
        } else if (juego.equals("LoL")) {
            if (objetivos >= 2 && asistencias >= 10) {
                System.out.println("Shotcaller 🗣️");
            }
            if (danoHecho >= 30000 && muertes <= 3) {
                System.out.println("Carry principal 🛡️");
            }
        } else if (juego.equals("Minecraft")) {
            if (tiempoMin >= 45 && danoRecibido == 0) {
                System.out.println("Superviviente pacífico 🌿");
            }
            if (objetivos >= 5) {
                System.out.println("Constructor incansable 🧱");
            }
        } else if (juego.equals("Pokemon")) {
            if (kills >= 6 && danoRecibido <= 1000) {
                System.out.println("Entrenador maestro 🧢");
            }
            if (asistencias >= 3) {
                System.out.println("Apoyo del equipo 🤝");
            }
        }

    }

}

