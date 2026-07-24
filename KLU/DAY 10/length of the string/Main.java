import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int count = 0;
        for(char c:s.toCharArray())
        count++;
        System.out.print(count);
    }
}