public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight)
    {
        super(name,age,weight);
        this.species = species;
    }//end all arg constr with call to super
    public String toString()
    {
        String output = super.toString();
        output+="\nSpecies: "+species;

        return output;
    }//to string with call to super
}//end class Lizard which is a pet

