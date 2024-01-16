public class HalfPyramid {
    public static void main(String[] args) {
      int n = 4;


      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {//i defines the limit that means 1 row 1 cols that print * same as all 
            System.out.print("*");
            
        }
        System.out.println("");
      }
    }
    
}
