import java.util.Scanner;

public class Budget1000 {
    public static void main(String args[]) {
        //Variables
        int rent = 75;
        int food = 10;
        int charity = 10;
        int sparechange = 10;
        int investment = 10;

        //Crunching
        System.out.println("Please enter your income");
        Scanner input = new Scanner(System.in);
        int Income = input.nextInt();
        System.out.println(Income);
        Income -= rent;
        System.out.println("Rent: " + rent);
        Income -= food;
        System.out.println("Food: " + food);
        Income -= charity;
        System.out.println("Charity: " + charity);
        Income -= sparechange;
        System.out.println("sparechange: " + sparechange);
        Income -= investment;
        System.out.println("Investment" + investment);

        //Leftovers
        if(Income > 0){
        for (int i = 0; Income > i; Income--) {
        food++;
           for (int p = 0;p < 1 ; p++) {
                    Income--;
                    sparechange++;

                }
            }


        }


            System.out.println("Calculating Extras.........Done");
            System.out.println("After food: "+food);
            System.out.println("After sparechange: "+sparechange);


    }
}







