import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        iniciarRobot();
        //Ejercicio 2
        sensoresCalibre();
        //Ejercicio 3
        programadorRobot("David");
        //Ejercicio 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el nombre");
        String name = sc.nextLine();
        bienvenidaRobot(name);
        //Ejercicio 5
        Scanner st = new Scanner(System.in);
        System.out.println("Pon un numero");
        int sensor1 = sc.nextInt();
        System.out.println("Pon otro numero");
        int sensor2 = sc.nextInt();
        sumaSensore(sensor1, sensor2);
        //Ejercicio 6
        Scanner sh = new Scanner(System.in);
        System.out.println("Pon una velocidad");
        int velocidad1 = sc.nextInt();
        velocidadMotor(velocidad1);
        //Ejercicios 7
        Scanner sj = new Scanner(System.in);
        System.out.println("Pon un numero");
        int n1 = sc.nextInt();
        movimientoEjecutado(n1);
        //Ejercicio 8
        Scanner sv = new Scanner(System.in);
        System.out.println("Cual es la temperatura del robot?");
        int temperatura = sc.nextInt();
        temperaturaRobot(temperatura);
        //Ejercicio 9
        Scanner sg = new Scanner(System.in);
        System.out.println("Pon un numero ");
        int lectura1 = sc.nextInt();
        System.out.println("Pon otro numero");
        int lectura2 = sc.nextInt();
        System.out.println("Pon otro numero");
        int lectura3 = sc.nextInt();
        lecturaSensores(lectura1, lectura2, lectura3);

    }//Ejercicio1

    public static void iniciarRobot() {
        System.out.println("Robot Inicializado");
    }//Ejercicio 2

    public static void sensoresCalibre() {
        System.out.println("Sensores Calibrados correctamente");
    }//Ejercicio 3

    public static void programadorRobot(String n) {
        System.out.println(n + " Es el programador del robot ");
    }//Ejercicio 4

    public static void bienvenidaRobot(String n) {
        System.out.println(n + " Bienvenido ");
    }//Ejercicio 5

    public static void sumaSensore(int s1, int s2) {
        System.out.println((s1 + s2) + " Resultado");
    }//Ejercicio 6

    public static void velocidadMotor(int v1) {
        if (v1 < 100) {
            System.out.println(" La velocidad es segura");
        } else {
            System.out.println(" La velocidad no es segura");
        }
    }

    public static void movimientoEjecutado(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" Movimiento ejecutado");
        }
    }

    public static void temperaturaRobot(int n) {
        if (n < 40) {
            System.out.println(" El robot puede seguir funcionando, esta a " + n + " Grados");
        } else {
            System.out.println(" El robot debe enfriarse, esta a " + n + " Grados");
        }
    }

    public static void lecturaSensores(int n, int x, int y) {
        if (n < x && n < y) {
            System.out.println(n + " El numero es el mas pequeño");
        } else if (x < n && x < y) {
            System.out.println(x + " El numero es el mas pequeño");
        } else {
            System.out.println(y + " El numero es el mas pequeño");
        }
    }
}
