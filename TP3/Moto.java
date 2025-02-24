public class Moto implements Vehicule{
    public int vitesse=180;
    public void demarrer(){
        System.out.println("Votre moto vient de s'allumer avec succès");
    }
    public void arreter(){
        System.out.println("Votre moto vient de stopper");
    }
    public int getVitesseMax(){
        System.out.println("La moto a une vitesse maximale en km/h de 180 ");
        return vitesse;
    }
} 

