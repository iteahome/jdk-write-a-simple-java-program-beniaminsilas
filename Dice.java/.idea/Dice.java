public class Dice {
    public static void main(String[] args) {
        int DiceRoll [] ={1,2,3,4,5,6,1,2,4,6,5};

        int NrFete=0;
        if(DiceRoll[DiceRoll.length-1]==6) {
            System.out.println("-1");
        }
        else {
            for (int i = 0; i < DiceRoll.length; i++) {
                NrFete++;
                if (DiceRoll[i] == 6) {
                    NrFete--;


                }
            }
            System.out.println(NrFete);
        }
    }
}