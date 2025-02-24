public class ecole extends institution  {
    private String type;
    private int nombreClasse;
    private String nomPromoteur;

    public  ecole (String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, String type, int nombreClasse, String nomPromoteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.type=type;
        this.nombreClasse=nombreClasse;
        this.nomPromoteur=nomPromoteur;
    }
    public String getType(){
        return type;
    }
    public int getNombreClasse(){
        return nombreClasse;
    }
    public String getNomPromoteur(){
        return nomPromoteur;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setNombreClasse(int nombreClasse){
        this.nombreClasse=nombreClasse;
    }
    public void setNomPromoteur(String nomPromoteur){
        this.nomPromoteur=nomPromoteur;
    }
    public void descriptionEcole(){
        System.out.println("Votre institution est une école dont :\nLe nom du promoteur est "+nomPromoteur+"\n avec comme nombre de classes "+nombreClasse+"\n et c'est une école "+type);
    }
    public void nomsPromoteurs(String promoteur1, String promoteur2, String promoteur3){
        System.out.println("Les 3 predecesseurs du promoteur actuel sont \n"+promoteur1+" , "+promoteur2+" et "+promoteur3);
    }
    
}
