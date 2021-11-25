public class Main {
    public static void main(String[] args){

        Direccion direccion = new Direccion("Rio grande", "45","Zacatecas");
        Empleado empleado = new Empleado(432,"Ricardo",direccion);
        System.out.println("Direccion de empleado: " + empleado.getDireccion());

        Direccion nuevaDireccion = empleado.getDireccion();
        nuevaDireccion.setNumero("55");

        System.out.println("Direccion de empleado: " + empleado.getDireccion());
    }
}
