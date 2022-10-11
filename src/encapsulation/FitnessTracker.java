package encapsulation;

public class FitnessTracker {
    public static void main(String[] args) {
        User user1 = new User("New", 11, 5, 1998, "test@email.com", "+380999272615", "Somthing", 64, 72, 10000);
        user1.getAge();


        user1.printAccountInfo();

        user1.setLastName("Something");
        user1.setPressure(100);
        user1.setWeight(65);
        user1.setSteps(15000);

        user1.printAccountInfo();
    }
}
