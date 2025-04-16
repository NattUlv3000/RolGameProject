public class Main {
    public static void main(String[] args) {
        //Creación de personajes
        Personaje guerrero = new Guerrero("Kandarr",80,10);
        Personaje mago = new Mago("Raltan",60,8);
        Personaje arquero = new Arquero("Arthur",75,9);

        //Simulación de combate
        System.out.println("Comienza la batalla");
        System.out.println();

        //Ataques
        guerrero.atacar(mago);
        mago.atacar(arquero);
        arquero.atacar(guerrero);

        //Uso de las habilidades espciales
        if (mago instanceof HabilidadEspecial){
            ((HabilidadEspecial)mago).usarHabilidad();
        }
        if (arquero instanceof HabilidadEspecial){
            ((HabilidadEspecial)arquero).usarHabilidad();
        }
        System.out.println();
        //Ataques que probarán la excepción
        guerrero.atacar(mago);  //-> Con este ataque el mago debería de morir
        try{
            guerrero.atacar(mago);  //Atacar a mago que está muerto
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}