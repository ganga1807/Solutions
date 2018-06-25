import java.util.*;
public class AntiPalindrome{
    
    public static boolean Palindrome(String s){
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String s = scan.nextLine();
        int l=s.length();
        while(Palindrome(s.substring(0,l))&&l!=0)l--;
        System.out.println(l);
    }
}
