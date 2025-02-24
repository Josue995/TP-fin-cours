public class universite extends institution  {
    private int nomFaculte;
    private String systemeEnseignement;
    private String nomRecteur;

    public  universite (String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, int nomFaculte, String systemeEnseignement, String nomRecteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.nomFaculte=nomFaculte;
        this.systemeEnseignement=systemeEnseignement;
        this.nomRecteur=nomRecteur;
    }
    public int getNomFaculte(){
        return nomFaculte;
    }
    public String getSystemeEnseignement(){
        return systemeEnseignement;
    }
    public String getNomRecteur(){
        return nomRecteur;
    }
    public void setNomFaculte(int nomFaculte){
        this.nomFaculte=nomFaculte;
    }
    public void setSystemeEnseignement(String systemeEnseignement){
        this.systemeEnseignement=systemeEnseignement;
    }
    public void setNomRecteur(String nomRecteur){
        this.nomRecteur=nomRecteur;
    }
    public void descriptionUniversite(){
        System.out.println("Votre institution est une université dont :\nLe nom du recteur est "+nomRecteur+"\nle nombre de ses facultés est "+nomFaculte+"\n avec comme système d'enseignement "+systemeEnseignement);
    }
    public void nomsRecteurs(String recteur1, String recteur2){
        System.out.println("Les 2 predecesseurs du recteur actuel sont \n"+recteur1+" et "+recteur2);
    }
    
}
