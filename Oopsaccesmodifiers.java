public class Oopsaccesmodifiers {
    public static void main(String args[]){
        Bankaccount myacc = new Bankaccount();
        myacc.username = "Vagupta128";
        myacc.setpassword("xyz@123");
        System.out.println(myacc.username);
        // System.out.println(myacc.password); password can't print because password is private
       myacc.printpassword(); // It show password because printpassword() is a public function
    }
}

class Bankaccount{
    public String username;
    private String password; // It(private) is not accesabble for public class and we can't print this
    public void setpassword(String pass){
        password = pass;
    }
    public void printpassword(){
        System.out.println(password);
    }
}