public abstract class Personaje {

    public String nombre;
    public double altura;
    public double peso;
    public String colorDePiel;
    public int porcentajeDePoder;
    public String estado;

    public Personaje(String nombre, double altura, double peso, String colorDePiel, int porcentajeDePoder, String estado) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorDePiel = colorDePiel;
        this.porcentajeDePoder = porcentajeDePoder;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorDePiel() {
        return colorDePiel;
    }

    public void setColorDePiel(String colorDePiel) {
        this.colorDePiel = colorDePiel;
    }

    public int getPorcentajeDePoder() {
        return porcentajeDePoder;
    }

    public void setPorcentajeDePoder(int porcentajeDePoder) {
        this.porcentajeDePoder = porcentajeDePoder;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void atacar(){
        System.out.println(String.format("%s: Inicia ataque !!", this.nombre));
    }

    public void correr(){
        System.out.println(String.format("%s: Inicia carrera !!", this.nombre));
    }

    public void saltar(){
        System.out.println(String.format("%s: Inicia salto !!", this.nombre));
    }

    public void esquivar(){
        System.out.println(String.format("%s: Esquiva el ataque !!", this.nombre));
    }

    public void morir(){
        System.out.println(String.format("%s: Ha muerto !!", this.nombre));
        this.estado = "Muerto";
    }

    public abstract void iniciarHabilidad();
}
