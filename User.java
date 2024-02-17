
public abstract class User {
    protected Subject subject;
    public abstract void notifyMe();
}
class User1 extends User{
    public String name = "";
    public User1(Subject subject, String name)
    {
        this.subject=subject;
        this.name =name;
        this.subject.attach(this);
    }
    @Override
    public void notifyMe()
    {
        System.out.println(name + " is notified");
    }
}