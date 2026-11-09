public class Gato extends Animal implements Asegurable, Vacunable{

    private boolean esterilizado;

    private int vacunasAplicadas = 0;

    public Gato(String nombre, int edad, String nombreDueño, boolean estaEsterilizado) {
        super(nombre, edad, nombreDueño);
        this.esterilizado = estaEsterilizado;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean estaEsterilizado) {
        this.esterilizado = estaEsterilizado;
    }

    @Override
    public long costoConsulta() {
        return 38_000;
    }

    @Override
    public double calcularPrimaSeguro() {
        if (isEsterilizado()){
            return 120000;
        }
        return 200000;
    }

    @Override
    public String getNumeroPoliza() {
        return "POL_GATO-" + getNombre() + " DUEÑO-" + getNombreDueno();
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
