import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s=obj.nextLine();
        String rev = " ";
        int i;
        for(i =s.length()-1;i>=0;i--)
        rev = rev+s.charAt(i);
        if(s.equals(rev))
        System.out.print("String palindrome");
        else 
        System.out.print("Not a string palindrome");
    }
}