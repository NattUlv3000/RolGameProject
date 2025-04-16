public class Mago extends Personaje implements HabilidadEspecial{

    public Mago(String nombre, double vida, int nivel){
        super(nombre, vida, nivel, "Báculo Mágico", 20.0);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre+ " lanza un hechizo con "+ arma.nombre+ " causando "+ arma.danio+" de daño.");
        try{
            objetivo.recibirDanio(arma.danio);
        }catch (PersonajeMuertoException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre+ " usa habilidad especial: Tormenta de fuego (daño en area adicional).");
    }
}
