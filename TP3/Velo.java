public class Velo implements Vehicule{
    public int vitesse=30;
    public void demarrer(){
        System.out.println("Votre vélo vient d'etre mis en mouvement avec succès");
    }
    public void arreter(){
        System.out.println("Votre vélo vient de s'arreter");
    }
    public int getVitesseMax(){
        System.out.println("Ce velo a une vitesse maximale en km/h de 30");
        return vitesse;
    }
} 
