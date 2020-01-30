public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, int age, double weight, String food)
    {
        super(name,age,weight,food);
        this.breed = breed;
    }//end all arg constr will call to super

    public String fetch()
    {
        if(Math.random() > .5)
            return "Fetch accomplished";
        else
            return "No fetching here";
    }//end method that exists in dog but not pet polymorphism
    public String Speak()
    {
        if(this.age<2)
            return "Yip";
        else
            return "Bark";
    }//end speak from parent
    public int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }//end if puppy
        else
        {
            dailyFeedings = 1;
        }//end else adult
        return dailyFeedings *30;
    }//end method w/ how many feedings per month
    public String toString()
    {
        String output =super.toString()+"\nBreed: "+breed;

        return output;
    }//to string with call to super
}//end class dog which is a pet
