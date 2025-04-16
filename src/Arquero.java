public class Arquero extends Personaje implements HabilidadEspecial{
    public Arquero(String nombre, double vida, int nivel){
        super(nombre, vida, nivel, "Arco", 23.0);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre+ " dispara una flecha con "+ arma.nombre+ " causando "+ arma.danio+ " de daño.");
        try{
            objetivo.recibirDanio(arma.danio);
        }catch (PersonajeMuertoException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre+ " usa habilidad especial: Flecha explosiva (daño crítico)");
    }
}
