import java.util.*;
class GrandFather {
    void gen1()
    {
        System.out.println("diamond");
    }
}
class Father extends GrandFather {
    void gen2()
    {
        System.out.println("Gold");
    }
}
class  Mother extends Father {
    void gen21()
    {
        System.out.println("Cash");
    }
}
class Son extends  Father {
    void gen22()
    {
        System.out.println("Silver");
    }
}
class Main 
    {
        public static void main (String[] args) {
            Son obj = new Son();
            obj.gen22();
            obj.gen2();
            Mother m = new Mother();
            m.gen21();
            m.gen2();
            Father f = new Father();
           
            f.gen1();
            
    }
}