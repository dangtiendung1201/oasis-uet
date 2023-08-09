import java.util.ArrayList;
import java.util.List;
public class Main
{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Nguyen A");
        p1.setAge(22);
        p1.setAdress("Ha Noi");
        Person p2 = new Person();
        p2.setName("Nguyen A");
        p2.setAge(20);
        p2.setAdress("Ha Noi");
        Person p3 = new Person();
        p3.setName("Le B");
        p3.setAge(20);
        p3.setAdress("Ha Noi");
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        List<Person> sortedList = Week11.sortGeneric(list);
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println((i + 1) + "." + sortedList.get(i).toString());
        }
    }
}