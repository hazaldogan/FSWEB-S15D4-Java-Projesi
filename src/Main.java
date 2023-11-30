import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
        System.out.println("*****************");
        System.out.println(decimalToBinary(5));

    }

    public static boolean checkForPalindrome(String text) {
        //Stack Palindrom
        /*Stack stack = new Stack();

        String newText = text.toLowerCase(Locale.ENGLISH).replaceAll("[.,!?\"\\s]","");

        for(int i = 0; i<newText.length();i++){
            stack.push(newText.charAt(i));
        }

        String reverse = "";

        while(!stack.isEmpty()){
            reverse += stack.pop();
        }
        if(newText.equals(reverse)){
            return true;
        }*/

        //Queue Palindrom
        Queue<Character> queue = new LinkedList<>();

        String newText = text.toLowerCase(Locale.ENGLISH).replaceAll("[.,!?\"\\s]","");

        for(int i = newText.length()-1; i>=0;i--){
            queue.add(newText.charAt(i));
        }

        String reverse = "";

        while(!queue.isEmpty()){
            reverse += queue.poll();
        }
        if(newText.equals(reverse)){
            return true;
        }
        return false;
    }

    public static LinkedList<Integer> decimalToBinary(int num){
        Stack stack = new Stack();
        LinkedList<Integer> result = new LinkedList<>();
        while(num>0){
            int r = num%2;
            stack.push(r);
            num = num / 2;
        }
        Iterator<Integer> iterator = stack.iterator();
        while(iterator.hasNext()){
            Integer binaryNumber = iterator.next();
            result.push(binaryNumber);
        }
        return result;
    }

}