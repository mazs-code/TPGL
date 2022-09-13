package fr.ufrsciencestech.panier;

/**
 *
 * @author majd
 */
public class Avocat {
    private double prix;
    private String origine;
	
    public Avocat() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Avocat(double prix, String origine) 
    {
        if(prix < 0)
            this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else
            this.prix = prix;

        if(origine.equals(""))
                this.origine = "Espagne";  //Espagne par défaut
        else
                this.origine = origine;   
        }

        public double getPrix(){
        return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Avocat de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 avocats sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Avocat or = (Avocat) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une avocat a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	    System.out.println("premier test Avocat");

        Avocat o = new Avocat(50, "Espagne");
        System.out.println(o.toString());

   }
}
