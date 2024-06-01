public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juanito", "34534E", 50000);
        empleados[1] = new EmpleadoMedioTiempo("sara", "75678J", 30.0, 15);
 
 
 
 
        for(int i= 0 ; i< empleados.length ; i++){
            System.out.println("empleado: "+empleados[i].getNombre() + ",  salario mensual es: "+empleados[i].CalcularSalario());
        }
    }
}

       
