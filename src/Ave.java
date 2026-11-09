public class Ave extends Animal{

    private double pesoGramos;
    private static final long baseConsulta = 28_000;

    public Ave(String nombre, int edad, String nombreDueño, double pesoGramos) {
        super(nombre, edad, nombreDueño);
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(double pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    @Override
    public long costoConsulta() {
        return (long) (baseConsulta + Math.round(100 * getPesoGramos()));
    }
}
