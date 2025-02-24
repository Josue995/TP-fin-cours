import java.util.Scanner;
public class Main_class {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        institution institution1 = new institution("ULPGL", "RDC", "privée", 1984);
        institution1.ageInstitution(2025);
        institution1.descriptionInstitution();

        universite universite1 = new universite("Harvard", "RDC", "privéé", 1950,7, "LMD","Wasso");
        universite1.ageInstitution(2025);
        universite1.descriptionInstitution();
        universite1.descriptionUniversite();
        universite1.nomsRecteurs("Kennedy","Mudogo");
        
        ecole ecole1 = new ecole("KAUTA", "MALAWI", "privée", 2004, "Primaire", 35,"Josué");
        ecole1.ageInstitution(2025);
        ecole1.descriptionInstitution();
        ecole1.descriptionEcole();
        ecole1.nomsPromoteurs("Baguma","Osée","Esther");


    }
    
    
}
