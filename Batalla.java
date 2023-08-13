public class Batalla {

    public static void main (String args []) {
        Personaje acuatico = new PersonajeAcuatico("Acuático", 1.9, 60, "Azul", 95, "Vivo");
        Personaje fuego = new PersonajeAcuatico("Antorcha", 1.95, 63.5, "Amarillo", 94, "Vivo");
        acuatico.correr();
        fuego.esquivar();
        acuatico.saltar();
        fuego.atacar();
        acuatico.esquivar();
        fuego.correr();
        Personaje roca = new PersonajeDeRoca("Roca", 1.85, 65.4, "Gris", 92, "Vivo");
        roca.atacar();
        fuego.esquivar();
        acuatico.esquivar();
        roca.atacar();
        fuego.morir();
        acuatico.morir();
        System.out.println(String.format("Estado de Artorcha: %s", fuego.getEstado()));
        System.out.println(String.format("Estado de Acuático: %s", acuatico.getEstado()));
        System.out.println(String.format("Estado de Roca: %s", roca.getEstado()));
        Personaje volador = new PersonajeVolador("Volador", 2.1, 80.2, "Blanco", 96, "Vivo");
        volador.atacar();
        roca.esquivar();
        roca.correr();
        volador.atacar();
        roca.morir();
        System.out.println(String.format("Estado de Roca: %s", roca.getEstado()));
        System.out.println(String.format("Estado de Volador: %s", volador.getEstado()));

    }
}
