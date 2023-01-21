class Student
{
    String name;
    int age;
    char grade;
    Location locate;

    Student(String n, int a, char g, Location l)
    {
        name = n;
        age = a;
        grade = g;
        locate = l;
    }
    void show()
    {
        System.out.println(name + " is " +age + " years old. His grade is " + grade+ ".");
        System.out.println("He lives in (" + locate.Homenumber + ") " + locate.StreetNumber+ ", "+ locate.city + "." );
    }

    public static void main(String[] args) {
        Location aa = new Location("Mawlamyine", "Htun Pin Gone", 47);
        Student a = new Student("Swam", 20, 'A', aa);
        a.show();
    }
}

class Location
{
    String city;
    String StreetNumber;
    int Homenumber;
    Location(String c, String s, int h)
    {
        city = c;
        StreetNumber = s;
        Homenumber = h;
    }
}
public class Q10 {
    public static void main(String[] args) {

    }
}
