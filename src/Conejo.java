public class Conejo extends Animal{

    public Conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }

    @Override
    public long costoConsulta() {
        return 35_000;
    }
}
