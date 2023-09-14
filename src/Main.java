public class Main
{
    public static void main(String[] args)
    {
        int fallCost = 100;
        int winterCost = 200;
        int springCost = 300;
        int summerCost = 400;
        int homeMaintenance = fallCost + winterCost + springCost + summerCost;
        
        System.out.println("Your annual home maintenance cost is " + homeMaintenance + " dollars.");
    }
}