import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList <Integer> getTenRolls() {
        Random randomInt= new Random();
        ArrayList <Integer> arrayRandom = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arrayRandom.add(randomInt.nextInt(20)+1);
        }
        return arrayRandom;
    }
    public char getRandomLetter() {
        
        ArrayList<Character> arrayChar = new ArrayList<Character>();
        

        for (char c = 'a'; c <='z'; c++){
            arrayChar.add(c);
            
    }
    
    Random randomInt= new Random();
    int i=randomInt.nextInt(26);
    return arrayChar.get(i);

}
    public String generatePassword(){
       String passWord = "";
       for (int i = 0; i<8;i++){
        passWord +=getRandomLetter();
       }
       return passWord;
    }
    public ArrayList <String> getNewPasswordSet(int n){
        ArrayList <String> arrayPassword = new ArrayList<>();
        String password;
        for (int i = 0; i<n; i++) {
            password = generatePassword();
            arrayPassword.add(password);
        }
        return arrayPassword;

    }
    public static void shuffleArray(int[] array) {
        Random random = new Random(); 
        for (int i = array.length - 1; i > 0; i--) {
            
            int j = random.nextInt(i + 1);
            
            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+",");
        }
    }
}
