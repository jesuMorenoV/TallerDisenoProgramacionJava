public class Tripulada extends Nave {
    private String capacidadPersonas;

    public Tripulada(String nombre, String tipoCombustible, String paisOrigen, String anioLansamiento, String capacidadPersonas) {
        super(nombre, tipoCombustible, paisOrigen, anioLansamiento);
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public void funcion() {
        System.out.println("\nNAVE TIPO TRIPULADA");
        System.out.println("Consiste en mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación");
    }

    @Override
    public String toString() {
        return  "\nDatos de la nave: " +super.toString()+
                "\nCapacidad de Personas= " + capacidadPersonas;
    }

    public String getCapacidadPersonas() {
        return capacidadPersonas;
    }
}
