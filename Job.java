//abstract class that will alloow diiferent sub classes to access 
//instancaes of different types of job employee have over time 
public abstract class Job 
{
    //initalizing objects and making them proctected so emplyee informatio n is safe
    protected String companyName;
    protected String position;
    protected String startDate;
    protected String endDate;

    //constroctor that will initalize the objects
    public Job(String companyName, String position, String startDate, String endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void displayJobDetails();
    public abstract int calculateJobDuration(); 
    public abstract String assessJobSatisfaction();
}
