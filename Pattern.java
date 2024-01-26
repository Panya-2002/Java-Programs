import java.util.*;

 class kiki{
    public void para(){
        for (int i = 1; i <= 4; i++) {

            for (int j = 0; j < 5; j++) {
                        System.out.print ("*");
            }
            System.out.println("   ");
        }
    }
}

public class Pattern {
    public static void main(String[] args) {
       kiki k1 = new kiki();
       k1.para(); 
    }
}
