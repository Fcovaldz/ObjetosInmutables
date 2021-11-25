public final class Empleado {
    private final int id;
    private final String nombre;
    private final Direccion direccion;

    public Empleado(int id, String nombre, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad());
    }

    public Empleado cambiarNombre(String nuevoNombre){
        return new Empleado(id, nuevoNombre, direccion);
    }
}
