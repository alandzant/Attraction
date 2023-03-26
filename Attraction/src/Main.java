import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
            List<Person> clients = generateClients();
            Queue<Person> attraction = new LinkedList<>(clients);

            while (attraction.isEmpty() != true){
                Person person = attraction.poll();
                int tickets = person.getTickets();
                tickets--;
                person.setTickets(tickets);
                System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе");
                if(tickets > 0){
                    attraction.offer(person);
                }

            }
    }

    public static List<Person> generateClients() {
        return List.of(
            new Person("Marusya", "Seraya", 2),
            new Person("Oleg", "Pupkin", 1),
            new Person("Marat", "Seregin", 4),
            new Person("Masha", "Golubeva", 3),
            new Person("Dima", "Dedov", 3)
        );
    }
}