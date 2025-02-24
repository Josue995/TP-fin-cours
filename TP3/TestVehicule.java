public class TestVehicule {
    
    public static void main(String[] args){
        Vehicule voiture1= new Voiture();
        Vehicule velo1= new Velo();
        Vehicule moto1= new Moto();
        
        voiture1.demarrer();
        voiture1.arreter();
        voiture1.getVitesseMax();

        velo1.demarrer();
        velo1.arreter();
        velo1.getVitesseMax();

        moto1.demarrer();
        moto1.arreter();
        moto1.getVitesseMax();

    }
}