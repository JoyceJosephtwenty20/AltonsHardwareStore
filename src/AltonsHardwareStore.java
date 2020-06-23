import java.util.Scanner;

public class AltonsHardwareStore {
    public static void main(String[] args){
        int wodenFence = 25;
        int chainLinkFence = 15;
        int gate = 150;
        double buildingPermit = 50;
        double taxRate = 1.06;
        Scanner input = new Scanner(System.in);

        System.out.println("What type of fence would you like to install? (1) Wooden or (2) Chain-link");
        int userSlection = input.nextInt();
            if (userSlection > 2 || userSlection <= 0) {
                System.out.println("Sorry Invalid Selection please try again!!!");

        }
            else if (userSlection <2 && userSlection > 0){
                System.out.println("How many yards of fencing do you want install? ");
                int fenceYards = input.nextInt();

                System.out.println("How many Gates would you like to install? ");
                int numberofGates = input.nextInt();

                int fencingCost = fenceYards * wodenFence;
                int gateCost = numberofGates * gate;
                double totalProjectCost = (fencingCost + gateCost)*taxRate + buildingPermit;
                System.out.println("Your estimated total project cost is: $" + totalProjectCost);


            }
            else{
                System.out.println("How many yards of fencing do you want install? ");
                int fenceYards = input.nextInt();

                System.out.println("How many Gates would you like to install? ");
                int numberofGates = input.nextInt();

                int fencingCost = fenceYards * chainLinkFence;
                int gateCost = numberofGates * gate;
                double totalProjectCost = (fencingCost + gateCost)*taxRate + buildingPermit;
                System.out.println("Total project cost is: $" + totalProjectCost);


        }


    }
}
