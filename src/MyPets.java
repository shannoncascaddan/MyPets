public class MyPets
{
    public static void main(String [] args)
    {
        Dog Rex = new Dog("Rex","German Shepard",2,160.2);
        System.out.println("Rex says "+Rex.Speak());

        Lizard Mochi = new Lizard("Mochi", "Bule-Tounged Skink",8,2.5);
        System.out.println("Mochi says "+Mochi.Speak());

        Bird Ronald = new Bird("Ronald", 3,1.13,"White",20,"Chicken");
        System.out.println("Ronald says "+Ronald.Speak());

        System.out.println(Rex);
        System.out.println(Rex.toLBS()+" Lbs");
        //Pet Tabitha = new Pet("Tabitha,", 2,19.4); pet is abstract and cant be instantiated
        //System.out.println(Tabitha);
    }//end main
}
