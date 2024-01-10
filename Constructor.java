
class Student {
    String names;
    int age;

    public void printinfo(){
        System.out.println("The Name of the Student"+this.names);
        System.out.println("The Age of the student is:"+this.age);
    }

  /*  Student(){ // Non Parameterized Constructor
        System.out.println("This is the constructor call");
    }
  */
    
  Student(String naam, int Age){ //Parameterized Constructor
      this.names = naam;
      this.age = Age;
    

  }
}

public class Constructor {//main class
   public static void main(String[] args) {
    Student student1 =  new Student("Aman",90);
    /* student1.names = "Piyush";
    student1.age = 23;
    */ 
    student1.printinfo(); 

   }
}
