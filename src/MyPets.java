public class MyPets
{
    public static void main(String [] args)
    {

        Pet Rex = new Dog("Rex","German Shepard",2,160.2,"Kibble");
        //System.out.println("Rex says "+Rex.Speak());

        Pet Mochi = new Lizard("Mochi", "Bule-Tounged Skink",8,2.5,"Crickets");
        //System.out.println("Mochi says "+Mochi.Speak());

        Pet Ronald = new Bird("Ronald", 3,1.13,"White",20,"Chicken","Seeds");
        //System.out.println("Ronald says "+Ronald.Speak());

        System.out.println(Rex);
        System.out.println(Mochi);
        System.out.println(Ronald);

        System.out.println("\nShannon Cascaddan");
        //System.out.println(Rex.fetch());//only works when rex is a dog not a pet
        //System.out.println(Rex.Speak());
        //int[] intArray = new int[5];
//        Pet[] zoo = new Pet[5]; // array of pets
//        zoo[0] = Rex;
//        zoo[1] = Mochi;
//        zoo[2] = Ronald;
//
//        for(int i = 0; i<zoo.length; i++)
//        {
//            System.out.println(zoo[i]);
//        }

//        System.out.println(Rex);
        //System.out.println(Rex.toLBS()+" Lbs");
        //Pet Tabitha = new Pet("Tabitha,", 2,19.4); pet is abstract and cant be instantiated
        //System.out.println(Tabitha);
    }//end main
}
