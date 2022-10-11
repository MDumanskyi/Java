package methods;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Nazar",  "Nerubko", "Varna", "8800055535353"));
    }
    public static String personInfo (String name, String lastName, String city, String phone){

        return "Сall to a citizen " + name + " " +lastName + " from " + city + " by phone: " + phone + "." ;
    }
}
