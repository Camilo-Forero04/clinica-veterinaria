//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Animal[] animales = new Animal[4];

    Perro perrito = new Perro("Tobey", 4, "Camilo", "Lobo");
    Gato gatito = new Gato("Ozzy", 3, "Laura", false);
    Clinica clinica = new Clinica("VetCare", "KR 1 CLL 1");

    animales[0] = perrito;
    animales[1] = gatito;
    animales[2] = new Ave("Piolin", 2, "Margarita", 25);
    animales[3] = new Conejo("Copito", 5, "Camilo");


    System.out.println("---------------ANIMALES---------------");

    for(Animal animal: animales){
        System.out.println(animal.toString());
    }

    System.out.println("\n--------------SEGURO---------------");

    Asegurable[] asegurables = { perrito, gatito, clinica};

    for (Asegurable asegurable : asegurables) {
        System.out.println("Poliza: " + asegurable.getNumeroPoliza());
        System.out.println("Prima a pagar: $" + asegurable.calcularPrimaSeguro());
    }

}
