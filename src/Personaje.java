interface HabilidadEspecial{
    void usarHabilidad();
};

abstract class Personaje {
    protected String nombre;
    private double vida;
    private int nivel;
    protected Arma arma;

    //Constructor de personajes en general
    public Personaje(String nombre, double vida, int nivel, String nombreArma, double danioArma) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.arma = new Arma(nombreArma, danioArma);
    }
    protected class Arma {
        String nombre;
        double danio;
        Arma(String nombre, double danio){
            this.nombre=nombre;
            this.danio=danio;
        }
    }

    //El mét odo abstracto para atacar
    public abstract void atacar(Personaje objetivo);

    //Un mét odo común para todos de recibir daño
    public void recibirDanio(double danio) throws PersonajeMuertoException{
        this.vida -=danio;
        System.out.println(nombre+" recibe "+danio+" de daño. Vida restante: "+vida);
        if (vida<0){
            throw new PersonajeMuertoException(nombre+" ha muerto.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }
}
