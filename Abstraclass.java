abstract class Animal{
     abstract void walk();
     }

class horse extends Animal{
     public void walk(){
        System.out.println("walks on 4 legs");
     }
}

class chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}



public class Abstraclass {
    public static void main(String[] args) {
        horse horse1 = new horse();
        horse1.walk();
         
    }
    
}
