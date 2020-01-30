public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight, String food)
    {
        super(name,age,weight, food);
        this.species = species;
    }//end all arg constr with call to super
    public String Speak()
    {
        return "Hiss";
    }//end speak from parent
    public int monthlyFeeding()
    {
        return 3;
    }//end method for num feedings
    public String toString()
    {
        String output = super.toString();
        output+="\nSpecies: "+species;

        return output;
    }//to string with call to super
}//end class Lizard which is a pet

