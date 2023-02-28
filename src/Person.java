
public class Person{
    String name;
    String city;
    int phoneNumber;

    public Person() {
        this.name = "";
        this.city = "";
        this.phoneNumber = 0;
    }
    public Person(String name, String city, int phoneNumber) {
        this.name = name;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

}
