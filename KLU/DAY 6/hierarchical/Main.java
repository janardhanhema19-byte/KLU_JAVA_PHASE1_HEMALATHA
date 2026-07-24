import java.util.*;
class Father {
    void gen1()
    {
        System.out.println("diamond");
    }
}
class Son extends Father {
    void gen21()
    {
        System.out.println("Gold");
    }
}
class  Daughter extends Father {
    void gen22()
    {
        System.out.println("Cash");
    }
}
class Main 
    {
        public static void main (String[] args) {
            Son obj = new Son();
            obj.gen21();
            obj.gen1();
            Daughter d = new Daughter();
            d.gen22();
            d.gen1();
            Father f = new Father();
           
            f.gen1();
            
    }
}