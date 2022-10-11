package encapsulation;

public class User {
    private String firstName;
    private int day;
    private int month;
    private int year;
    private String email;
    private String phone;
    private String lastName;
    private int weight;
    private int pressure;
    private int steps;
    private int age;

    User(String firstName, int day, int month, int year, String email, String phone, String lastName, int weight, int pressure, int steps) {
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.print("Вас зовут: " + firstName + " " + lastName + ", ");
        System.out.print("день рождения - " + day + "." + month + "." + year + " " + "(возраст " + age + "), ");
        System.out.print("почта " + email + ", ");
        System.out.print("номер телефона " + phone + ", ");
        System.out.print("вес " + weight + ", ");
        System.out.print("давление " + pressure + ", ");
        System.out.println("Количество шагов " + steps + ".");
    }

    public void getAge() {
        this.age = 2022 - this.year;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
