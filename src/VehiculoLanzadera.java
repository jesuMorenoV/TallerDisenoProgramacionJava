public class VehiculoLanzadera extends Nave{

    private String capasidadCarga;
    private String tipoCarga;

    public VehiculoLanzadera(String nombre, String tipoCombustible, String paisOrigen, String anioLansamiento, String capasidadCarga, String tipoCarga) {
        super(nombre, tipoCombustible, paisOrigen, anioLansamiento);
        this.capasidadCarga = capasidadCarga;
        this.tipoCarga = tipoCarga;
    }

    @Override
    public void funcion() {
        System.out.println("Sirve para lanzar una carga útil al espacio, normalmente un satélite artificial, una sonda o una nave tripulada.");
    }

    @Override
    public String toString() {
        return "VehiculoLanzadera{" +
                "capasidadCarga='" + capasidadCarga + '\'' +
                ", tipoCarga='" + tipoCarga + '\'' +
                super.toString()+'\'' +
                '}';
    }

    public String getCapasidadCarga() {
        return capasidadCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }
}
