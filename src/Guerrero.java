public class Guerrero extends Personaje {

    public Guerrero(String nombre, double vida, int nivel){
        super(nombre,vida,nivel, "Espada", 25.0);
    }
    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre+ " ataca con "+ arma.nombre + " causando " + arma.danio+ " de daño.");
        try{
            objetivo.recibirDanio(arma.danio);
        }catch (PersonajeMuertoException e){
            System.out.println(e.getMessage());
        }
    }

}
