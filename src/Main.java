import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Per", "076077", 27);
        Person p2 = new Person("Mouhammad", "07766", 25);
        Person p3 = p1;

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for(Person p : persons){
            System.out.println(p);
        }


    }
}