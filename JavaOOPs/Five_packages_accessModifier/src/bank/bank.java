
package bank; // we made this class package so we import in different codes
class Account{
    public String name;        // public modifier ( everyone can access this info also by import )
    String email;              // default modifier ( can access this info only in this class/code )
    protected String balance;  // protected modifier ( everyone can access in this class
                               // and only subclass is excess in diff code as a package )
    private String password;       // private modifier ( only "Account" class has access )

    // HOW we use private modifier in sub or public class. So, we use GETTERS and SETTERS
    //GETTER
    public String getPassword(){
        // setPassword("abababab");             // use if we want setPassword private
        return this.password;
    }
    // SETTER
    void setPassword(String pass){      // if we use private like "private void setPassword"
        this.password = pass;                   // so no one can change password
    }
}
public class bank {
    public static void main (String[] args){
        Account account1 = new Account();
        account1.name = "Sarwar";
        account1.email = "sarwar@gmail.com";
        account1.balance = "crores";
        // account1.pass = "abcd"; // (error bcz use private modifier for password in package)

        account1.setPassword("bcdz");                // setter getter only use in same code
        System.out.println(account1.getPassword());  // not use by import package in different class

    }
}
// MODIFIER
// There are 4 type of modifier
// 1 - PUBLIC MODIFIER
// 2 - DEFAULT  MODIFIER
// 3 - PROTECTED  MODIFIER
// 4 - DEFAULT  MODIFIER