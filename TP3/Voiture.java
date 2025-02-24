public class Voiture implements Vehicule{
    public int vitesse=200;
    public void demarrer(){
        System.out.println("Votre voiture vient de demarrer avec succès");
    }
    public void arreter(){
        System.out.println("Votre voiture vient de s'arreter");
    }
    public int getVitesseMax(){
        System.out.println("La voiture a une vitesse maximale en km/h de 200");
        return vitesse;
    }
} 
