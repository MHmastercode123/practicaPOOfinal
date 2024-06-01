abstract class Empleado {

    private String nombre;
    private String NumIdentificacion;

    public Empleado(String nombre , String NumIdentificacion) {
    
    this.nombre = nombre;
    this.NumIdentificacion = NumIdentificacion;

    }
    public String getNombre() {
        return nombre;
    }
    public String getNumIdentificacion() {
        return NumIdentificacion;
    }

    public abstract double CalcularSalario();
}
