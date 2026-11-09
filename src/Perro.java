public class Perro extends Animal implements Asegurable, Vacunable{

    private static final long baseConsulta = 45_000;

    private String raza;

    private int vacunasAplicadas = 0;

    public Perro(String nombre, int edad, String nombreDueño, String raza) {
        super(nombre, edad, nombreDueño);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public long costoConsulta() {
        return baseConsulta + (3000L * getEdad());
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * getEdad();
    }

    @Override
    public String getNumeroPoliza() {
        return "POL_PERRO-" + getNombre() + " DUEÑO-" + getNombreDueno();
    }

    @Override
    public void registrarVacuna(String nombre) {
        this.vacunasAplicadas += 1;
    }

    @Override
    public int getVacunasAplicadas() {
        return this.vacunasAplicadas;
    }
}
