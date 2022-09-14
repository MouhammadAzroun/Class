public class Person {
    String name;
    String phoneNumber;
    int age;

    public Person (String name, String phoneNumber, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String toString (){
        return name + " " + phoneNumber + " " + age;
    }
}
