public abstract class Pet
{
    protected String name;
    protected int age;
    protected double weight;//kg

    public Pet(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }//end all arg constr

    public String getName()
    {
        return name;
    }//age name
    public double getAge()
    {
        return age;
    }//get age
    public double getWeight()
    {
        return weight;
    }//get weight
    public void setName(String name)
    {
        this.name = name;
    }//see name

    abstract public String Speak();//to be overriden in all child classes
    public double toLBS()
    {
        return weight *2.205;
    }//end method to convert to LBS

    public String toString()
    {
        String output = "Name: "+name;
        output+="\nAge: "+age;
        output+="\nWeight: "+weight;

        return output;
    }//to string
}//end class pat
