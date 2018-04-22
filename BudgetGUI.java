import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        //Variables
        int rent = 75;
        int food = 10;
        int charity = 10;
        int sparechange = 10;
        int investment = 10;

        //Crunching
        String Input = JOptionPane.showInputDialog("Enter your Income");
        int Income = Integer.parseInt(Input);
        Income -= rent;
        Income -= food;
        Income -= charity;
        Income -= sparechange;
        Income -= investment;

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

        JOptionPane.showMessageDialog(null,"Rent:"+rent+"\n"+"Food:"+food+"\n"+"Spare change:"+sparechange+"\n"+"Charity:"+charity+"\n"+"Investment: "+investment,"This week's budget.",JOptionPane.PLAIN_MESSAGE);


    }
}
