public class institution {
    private String nomInstitution;
    private String paysInstitution;
    private String typeInstitution;
    private int anneeCreation;
    public int ageInstitution;

    public institution ( String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation){
        this.nomInstitution=nomInstitution;
        this.paysInstitution=paysInstitution;
        this.typeInstitution=typeInstitution;
        this.anneeCreation=anneeCreation;

    }
    public String getNomInstitution(){ 
        return nomInstitution;
    }    
    public String getPaysInstitution(){
            return paysInstitution;
        }
    public String getTypeInstitution(){
            return typeInstitution;
        }
    public int getAnneeCreation(){
        return anneeCreation;
    }

     public void setNomInstitution(String nomInstitution){
            this.nomInstitution = nomInstitution;
        }
    public void setPaysInstitution(String paysInstitution){
            this.paysInstitution = paysInstitution;
        }
    public void setTypeInstitution(String typeInstitution){
        this.typeInstitution=typeInstitution;
    }
    public void setAnneeCreation(int anneeCreation){
        this.anneeCreation=anneeCreation;
    }
    public int ageInstitution(int anneeCourante){
        return ageInstitution=anneeCourante-anneeCreation;
    }
    public void descriptionInstitution(){
        System.out.println("Voici la description :"+ "\n Votre institution est agé de "+ageInstitution+ " ans \nIl se nomme :"+nomInstitution+"\nIl se situe en "+paysInstitution+"\nIlest de type "+typeInstitution+"\nIl a été créé en "+anneeCreation);
    }

}