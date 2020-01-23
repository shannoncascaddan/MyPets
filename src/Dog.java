public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, int age, double weight)
    {
        super(name,age,weight);
        this.breed = breed;
    }//end all arg constr will call to super
    public String Speak()
    {
        if(this.age<2)
            return "Yip";
        else
            return "Bark";
    }//end speak from parent
    public String toString()
    {
        String output =super.toString()+"\nBreed: "+breed;

        return output;
    }//to string with call to super
}//end class dog which is a pet
