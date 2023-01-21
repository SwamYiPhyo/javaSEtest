public class Q5 {
    private String firstname;
    private String lastname;


    public String getFirstname()
    {
        return firstname;
    }
    public String setFirstname(String fn)
    {
        this.firstname = fn;
        return fn;
    }
    public String getLastname()
    {
        return lastname;
    }
    public String setLastname(String ln)
    {
        this.firstname = ln;
        return ln;
    }
    Q5(String Fn, String Ln)
    {
        firstname = Fn;
        lastname = Ln;
    }
    void insert()
    {
        System.out.println("First Name: " + firstname + ", Lastname: " + lastname);
    }
}
class Hello
{
    public static void main(String[] args) {
        Q5 a = new Q5("Swam", "Yi Phyo");
        a.insert();
    }
}
