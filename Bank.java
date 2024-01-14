package bank;

class Account{
   public  String name;
   protected String email;  
   private String password;

   //getters and seetters

   public String getPassword(){//getter
    return this.password;
   } 
   public void setPassword(String pass){//setter
    this.password = pass;
   }
     
}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Shraddha";
        account1.email = "hey@mail";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
