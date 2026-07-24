import java.util.*;
class Father {
    void gen2()
    {
        System.out.println("Gold");
    }
}
class son extends Father {
    void gen3()
    {
        System.out.println("Cash");
    }
}
class Main 
    {
        public static void main (String[] args) {
            son obj = new son();
            obj.gen3();
            obj.gen2();
            Father f = new Father();
            f.gen2();
    }
}