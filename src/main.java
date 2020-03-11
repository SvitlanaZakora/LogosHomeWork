import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class main{
    public static void main(String[] args) {

        Set<Object> unsortedHumans = new HashSet<>();
        unsortedHumans.add(new Human("Petro",45));
        unsortedHumans.add(new Human("Тanya",21));
        System.out.println("Before sorting" + unsortedHumans);
        SortedSet<Object> human = new TreeSet<>(unsortedHumans);
        System.out.println("After sorting" + human);


    }
}
