import java.text.DecimalFormat;// to format weight in lbs
public abstract class Pet
{
    protected String name;
    protected int age;
    protected double weight;//kg
    DecimalFormat fmt = new DecimalFormat(".#");//to format weight in lbs
    public String food;

    public Pet(String name, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
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
    abstract public int monthlyFeeding();//to be overriden in all child classes
    public double toLBS()
    {
        return weight *2.205;
    }//end method to convert to LBS

    public String toString()
    {
        String output = "Name: "+name;
        output+="\nAge: "+age;
        output+="\nWeight: "+weight+" kg"+"("+fmt.format(toLBS())+" in pounds)";
        output+="\nFood: "+food;
        return output;
    }//to string
}//end class pat
