import java.util.Collection;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Volodya", "Aleshin", 50));
        persons.add(new Person("Aleksey","Volodinin-Petrov", 20));
        persons.add(new Person("Egor","Petrov-Alekseev-Ivin",30));
        persons.add(new Person("Vlad","Minin",45));

        Collections.sort(persons, ((o1, o2) -> {
            int length1 = o1.getSurname().split("-").length;
            int length2 = o1.getSurname().split("-").length;
            if(length1<length2){
                return -1;
            }
            if(length1>length2){
                return 1;
            }
            return o1.getAge() - o2.getAge();
        }));
        

        persons.forEach(System.out::println);
    }
}