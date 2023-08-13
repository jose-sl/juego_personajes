public class PersonajeDeFuego extends Personaje {

    public PersonajeDeFuego(String nombre, double altura, double peso, String colorDePiel, int porcentajeDePoder, String estado) {
        super(nombre, altura, peso, colorDePiel, porcentajeDePoder, estado);
        System.out.println(String.format("Iniciando personaje: %s", nombre));
    }

    @Override
    public void iniciarHabilidad() {
        System.out.println(String.format("%s: Inicia habilidad de fuego !!", this.nombre));
    }
}
