public class PersonajeAcuatico extends Personaje {

    public PersonajeAcuatico(String nombre, double altura, double peso, String colorDePiel, int porcentajeDePoder, String estado) {
        super(nombre, altura, peso, colorDePiel, porcentajeDePoder, estado);
        System.out.println(String.format("Iniciando personaje: %s", nombre));
    }

    @Override
    public void iniciarHabilidad() {
        System.out.println(String.format("%s: Inicia habilidad bajo el agua !!", this.nombre));
    }
}
