public class NoTripulada extends Nave{
    public String tipoEstudio;

    public NoTripulada(String nombre, String tipoCombustible, String paisOrigen, String anioLansamiento, String tipoEstudio) {
        super(nombre, tipoCombustible, paisOrigen, anioLansamiento);
        this.tipoEstudio = tipoEstudio;
    }


    @Override
    public void funcion() {
        System.out.println("Estudiar otros cuerpos celestes");
    }

    @Override
    public String toString() {
        return "NoTripulada{" +
                "tipoEstudio='" + tipoEstudio + '\'' +
                super.toString()+'\'' +
                '}';
    }

    public String getTipoEstudio() {
        return tipoEstudio;
    }
}
