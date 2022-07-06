import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Nave> naves = new ArrayList<Nave>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        datosNave();
        mostrarNaves();
    }

    public static  void datosNave(){
    int opcion;
    char respuesta;
         do {
             do {
                 System.out.println("Digite que tipo de nave desea");
                 System.out.println("1. Nave de tipo Lanzadera");
                 System.out.println("2. Nave de tipo Tripulada");
                 System.out.println("3. Nave de tipo no tripulada");
                 System.out.println("Opcion\n");
                 opcion= entrada.nextInt();
                 entrada.nextLine();
             }while (opcion<1 || opcion>3);

             switch (opcion){

                 case 1: datosVehiculoLanzadera();
                     break;
                 case 2: datosTripulada();
                     break;
                 case 3: datosNoTripula();
                     break;

             }
             System.out.println("Desea introducir otra nave (s/n)");
             respuesta=entrada.next().charAt(0);
             System.out.println("");
         }while (respuesta=='s' || respuesta=='S');
    }

    public  static void datosVehiculoLanzadera(){
        String nombre, tipoCombustible, paisOrigen, anioLansamiento, capasidadCarga, tipoCarga;
        System.out.println("\nLANZADERA");
        System.out.println("\nDigite el nombre de la nave");
        nombre=entrada.nextLine();
        System.out.println("\nDigite el tipo de conbustible de la nave");
        tipoCombustible=entrada.nextLine();
        System.out.println("\nDigite el pais de origen de la nave");
        paisOrigen=entrada.nextLine();
        System.out.println("\nDigite el año de lanzamiento");
        anioLansamiento=entrada.nextLine();
        System.out.println("\nDigite la capacidad de carga");
        capasidadCarga=entrada.nextLine();
        System.out.println("Digite el tipo de carga");
        tipoCarga=entrada.nextLine();

        VehiculoLanzadera vehiculoLanzadera = new VehiculoLanzadera(nombre,tipoCombustible,paisOrigen,anioLansamiento,capasidadCarga,tipoCarga );
        naves.add(vehiculoLanzadera);
    }

    public static void datosTripulada(){
        String nombre, tipoCombustible, paisOrigen, anioLansamiento, capacidadPersonas;
        System.out.println("\nTRIPULADA");
        System.out.println("\nDigite el nombre de la nave");
        nombre=entrada.nextLine();
        System.out.println("\nDigite el tipo de conbustible de la nave");
        tipoCombustible=entrada.nextLine();
        System.out.println("\nDigite el pais de origen de la nave");
        paisOrigen=entrada.nextLine();
        System.out.println("\nDigite el año de lanzamiento");
        anioLansamiento=entrada.nextLine();
        System.out.println("\nDigite la cantidad de pasajeros");
        capacidadPersonas=entrada.nextLine();
        Tripulada tripulada = new Tripulada(nombre,tipoCombustible,paisOrigen,anioLansamiento,capacidadPersonas);
        naves.add(tripulada);
    }

    public static void datosNoTripula(){
        String nombre, tipoCombustible, paisOrigen, anioLansamiento, tipoEstudio;
        System.out.println("\nNO TRIPULADA");
        System.out.println("\nDigite el nombre de la nave");
        nombre=entrada.nextLine();
        System.out.println("\nDigite el tipo de conbustible de la nave");
        tipoCombustible=entrada.nextLine();
        System.out.println("\nDigite el pais de origen de la nave");
        paisOrigen=entrada.nextLine();
        System.out.println("\nDigite el año de lanzamiento");
        anioLansamiento=entrada.nextLine();
        System.out.println("\nDigite el cuerpo celeste que estudiara");
        tipoEstudio=entrada.nextLine();
        NoTripulada noTripulada = new NoTripulada(nombre,tipoCombustible,paisOrigen,anioLansamiento,tipoEstudio);
        naves.add(noTripulada);
    }

    public static void mostrarNaves(){
        for (Nave nav:naves) {
            nav.funcion();
            System.out.println(nav.toString());
        }
    }
}
