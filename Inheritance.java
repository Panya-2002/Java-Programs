public class shape{ //base classs
    String color;
        public void area(){
            System.out.println("the area");
        }
}
//single inheritance
//one base and another is derived 
class triangle extends shape{
        public void area(int length, int height){
            System.out.println(0.5*length*height);
        }
}
/* 
//multilevel inheritance
//one base,one intermediate and derived class
 class euilateraltriangle extends triangle{
       public void area(int length, int height){
        System.out.println(0.5*length*height);
       }
 }  
 */


//heirarchical inheritance
//one base class mltiple derived classes
 class circle extends shape{
    public void area(){
        System.out.println(3.14*r*r);

    }
 }


  

public class Inheritance {
    
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.color = "red";
    }
}
