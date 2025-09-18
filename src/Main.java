import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciarRobot();

        sensoresCalibre();

        programadorRobot("David");

        Scanner sc = new Scanner(System.in);
        System.out.println(" Pon el nombre");
        String name = sc.nextLine();
        bienvenidaRobot(name);

        Scanner st = new Scanner(System.in);
        System.out.println(" Pon un numero");
        int sensor1 = sc.nextInt();
        System.out.println(" Pon otro numero");
        int sensor2 = sc.nextInt();
        sumaSensore(sensor1, sensor2);

        Scanner sh = new Scanner(System.in);
        System.out.println(" Pon una velocidad");
        int velocidad1 = sc.nextInt();
        velocidadMotor(velocidad1);


    }
        public static void iniciarRobot() {
            System.out.println("Robot Inicializado");
    }
        public static void sensoresCalibre() {
        System.out.println("Sensores Calibrados correctamente");
    }
        public static void programadorRobot(String n) {
        System.out.println(n + " Es el programador del robot ");
    }
        public static void bienvenidaRobot(String n) {
        System.out.println(n + " Bienvenido ");
    }
        public static void sumaSensore(int s1, int s2) {
        System.out.println((s1 + s2) + " Resultado");
    }
        public static void velocidadMotor(int v1){
        if (v1 < 100){
            System.out.println(" La velocidad es segura");
        } else {
            System.out.println(" La velocidad no es segura");
        }
    }

    }
