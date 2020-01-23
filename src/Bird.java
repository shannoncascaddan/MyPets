public class Bird extends Pet
{
    private String species;
    private String color;
    private double wingspan; //inches

    public Bird (String name, int age, double weight, String color, double wingspan, String species)
    {
        super(name,age,weight);
        this.color = color;
        this.wingspan =wingspan;
        this.species = species;
    }//end all arg constr with call to super
    public String Speak()
    {
        return "Chirp";
    }//end speak from parent
    public String toString()
    {
        String output = super.toString();
        output+="\nColor: "+color;
        output+="\nWingspan (inches): "+wingspan;
        output+="\nSpecies: "+species;
        return output;
    }//to string with call to super
}//end class bird which is a pet
