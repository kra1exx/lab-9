import java.util.ArrayList;
public class Сonference  {
    private ArrayList<Studies> studiess = new ArrayList<Studies>();
    public void addf(Studies m) {
        studiess.add(m);}
    public Сonference () {
    }
    public int countSchoolkid() {
        int count = 0;
        for (Studies a : studiess) {
            if (a instanceof Schoolkid)
                count++;}
        return count;}
    public int countStudent() {
        int count = 0;
        for (Studies a : studiess) {
            if (a instanceof Student)
                count++;}
        return count;
    }
    public Сonference (ArrayList<Studies> n) {
        studiess = n;}
    public void printСonference () {
        System.out.println("В конференции: ");
        for (Studies a : studiess) {
            System.out.println("\t" + a.toString());}
    }
}