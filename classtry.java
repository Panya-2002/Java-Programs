class car {

    
    String name ;
    int modelno;

    public void write() {//memeber function
        System.out.println("hello this is printing Function");
        //System.out.println("the color of the car is "+name);
        //System.out.println("the model numbr of the car is:"+modelno);
    }

    public void printname() {
        System.out.println("The Car name is :"+this.name);
    }

    public void printmodelno(){
        System.out.println("The car model number as:"+this.modelno);
    }
}
class Student {
    String names;
    int age;

    public void printinfo(){
        System.out.println("The Name of the Student"+this.names);
        System.out.println("The Age of the student is:"+this.age);
    }

  /*  Student(){ //Non Parameterized Constructor
        System.out.println("This is the constructor call");
    }
  */
    
  Student(String naam, int Age){ //Parameterized Constructor
      this.names = naam;
      this.age = Age;
    

  }
}

public class classtry {//main class
   public static void main(String[] args) {
    /*car car1 = new car();
    car car2 = new car();

    car1.name = "Toyota";
    car1.modelno =345678;
    car1.write();

    car2.name ="Suzuki";
    car2.modelno = 798990;
    car2.printname();
    car2.printmodelno();
    car1.printname();
    car1.printmodelno();*/


    Student student1 =  new Student("Aman",90);
    /* student1.names = "Piyush";
    student1.age = 23;
    */ 
    student1.printinfo(); 

   }
}
