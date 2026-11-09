public abstract class Animal {
    private String nombre;
    private int edad;
    private String nombreDueno;


    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    @Override
    public String toString() {
        return String.format("Me llamo %s, tengo %d, mi dueño es %s, y mi consulta vale %d", getNombre(), getEdad(), getNombreDueno(), costoConsulta());
    }

    public abstract long costoConsulta();
}
