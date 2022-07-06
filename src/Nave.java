public abstract class Nave {
    protected String nombre;
    protected String tipoCombustible;
    protected String paisOrigen;
    protected String anioLansamiento;

    public Nave(String nombre, String tipoCombustible, String paisOrigen, String anioLansamiento) {
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.paisOrigen = paisOrigen;
        this.anioLansamiento = anioLansamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getAnioLansamiento() {
        return anioLansamiento;
    }

    public  abstract void funcion();

    @Override
    public String toString() {
        return
                "\nNombre= " + nombre  +
                "\nTipo de Combustible= " + tipoCombustible  +
                "\nPais de origen= " + paisOrigen +
                "\nAño de lanzamiento= " + anioLansamiento ;
    }
}
