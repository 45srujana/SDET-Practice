package JavaD1_Class_Assignment1;

public class Netflix_Login {
    static String url=" https://www.netflix.com/in/\n";

    static String user_name="donhere";
    static String password="donehere@123";
//    static String user_name=null;
//    static String password="donehere@123"

    public static void main(String[] args){
        System.out.println(clickOnUrl());
        System.out.println(signInPage());
        System.out.println(verifySignIn());

    }

    public  static String clickOnUrl(){
        return "Please sign in through this url - "+url;
    }
    public  static String signInPage(){
        return "Username : " +user_name +"\n"+"Password : "+password;
    }
    public  static String verifySignIn(){

        if(user_name!=null&&password!=null){

            return "Signed in to Netflix successfully!!"+"\n"+"Enjoy your show!!";
        }else{

            return "Invalid Username or Password";
        }


    }

}
