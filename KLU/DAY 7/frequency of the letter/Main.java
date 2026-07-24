import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int freq[] = new int[256];
        int count = 0,i;
        for(i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for(i=0;i<256;i++){
            char ch = s.charAt(i);
            System.out.println(ch+":"+freq[ch]);
        }
    }
}