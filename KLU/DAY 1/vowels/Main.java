
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int count = 0;
        for(char c:s.toCharArray())
        {
            if(!(c=='A'|| c=='E'||c=='I'||c=='0'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
            count++;
            
        }
        System.out.print(count);
    }
}