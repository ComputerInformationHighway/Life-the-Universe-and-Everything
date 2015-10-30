import java.util.Random;

public class ComputerInformationHighway {

    public static void main(String[] args) {
        
        boolean answer;
        
        do {
            
        int newNumber = getNewNumber(1, 100);
        answer = theAnswer(newNumber);
        
        System.out.println("What is the answer to life, the universe, and everything? Is it " + newNumber + "?");
        
        if(answer)
            System.out.println("Yes!");
        else
            System.out.println("No!");
        
        }while(!answer);
        
    }
    
    public static boolean theAnswer(int supAns) {
        return supAns == 42;
    }
    
    public static int getNewNumber(int min, int max) {
        
        Random ran = new Random();
        
        return ran.nextInt(max - min + 1) + min;
    }
    
}
