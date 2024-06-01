public class EmpleadoTiempoCompleto extends Empleado{

    private double SalarioAnual;

    public EmpleadoTiempoCompleto(String nombre , String NumIdentificacion , double SalarioAnual){
        super(nombre, NumIdentificacion );
        this.SalarioAnual = SalarioAnual;
    }

@Override
public double CalcularSalario(){
    return SalarioAnual / 12;
}

}
