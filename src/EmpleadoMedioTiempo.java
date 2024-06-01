public class EmpleadoMedioTiempo extends Empleado {

    private double salarioXhora;
    private int horasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String nombre , String NumIdentificacion , double salarioXhora , int horasTrabajadasPorSemana){

        super(nombre, NumIdentificacion);
        this.salarioXhora = salarioXhora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;


    }

@Override

public double CalcularSalario(){

    return salarioXhora * horasTrabajadasPorSemana * 4 ;
}

}

