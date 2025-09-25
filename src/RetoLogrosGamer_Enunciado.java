public class RetoLogrosGamer_Enunciado {


    public static void main(String[] args) {


        String juego = "Fortnite";
        int kills = 16;
        int muertes = 2;
        int asistencias = 3;
        int tiempoMin = 25;
        int objetivos = 1;
        boolean desconexion = false;
        int dañoHecho = 18000;
        int dañoRecibido = 6000;
        int oro = 2300;

        System.out.println("Juego: " + juego);

        if (muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2) {
            System.out.println("Partida inválida: AFK");
            return;
        }

        if (desconexion = true && tiempoMin < 5) {
            System.out.println("Logro NEGATIVO: Rage Quit \uD83D\uDE20");
            return;

        }
        double KDA = ((kills + asistencias) / Math.max(1, muertes));
        System.out.println("KDA = " + KDA);


        if (KDA >= 5) {
            System.out.println("Jugador PRO");
        } else if (KDA >= 3 && KDA < 5) {
            System.out.println("Jugador BUENO");
        } else if (KDA >= 1 && KDA < 3) {
            System.out.println("Jugador NORMAL");
        } else if (KDA < 1) {
            System.out.println("Jugador NOOB");
        }


        if (kills >= 10) {
            System.out.println("Logro: Cazador experto \uD83C\uDFF9");
        } else if (muertes == 0 && kills >= 5) {
            System.out.println("Logro: Intocable \uD83D\uDC51");
        } else if (tiempoMin > 60) {
            System.out.println("Logro: Maratón gamer ⏱\uFE0F");
        } else if (dañoHecho > (dañoRecibido * 2)) {
            System.out.println("Logro: Dominio total \uD83D\uDCA5");
        } else if (objetivos >= 3) {
            System.out.println("Logro: Objetivos de mapa \uD83C\uDFAF");
        }


        if (juego.equals("Fortnite")) {
            if (kills >= 15 && muertes <= 2) {
                System.out.println("Victoria agresiva (Fortnite) 🔫");
            }
            if (oro >= 2000) {
                System.out.println("Ahorrista de V-Bucks (Fortnite) 💰");
            }
        } else if (juego.equals("LoL")) {
            if (objetivos >= 2 && asistencias >= 10) {
                System.out.println("Shotcaller (LoL) 🗣️");
            }
            if (dañoHecho >= 30000 && muertes <= 3) {
                System.out.println("Carry principal (LoL) 🛡️");
            }
        } else if (juego.equals("Minecraft")) {
            if (tiempoMin >= 45 && dañoRecibido == 0) {
                System.out.println("Superviviente pacífico (MC) 🌿");
            }
            if (objetivos >= 5) {
                System.out.println("Constructor incansable (MC) 🧱");
            }
        } else if (juego.equals("Pokemon")) {
            if (kills >= 6 && dañoRecibido <= 1000) {
                System.out.println("Entrenador maestro (PKMN) 🧢");
            }
            if (asistencias >= 3) {
                System.out.println("Apoyo del equipo (PKMN) 🤝");
            }
        }

    }

}

