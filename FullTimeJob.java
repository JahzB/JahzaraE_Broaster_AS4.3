// Public class FullTimeJob extends Job to specify attributes and methods for a full-time job.
public class FullTimeJob extends Job 
{
    // Declare fields for full-time job and make them private since this is sensitive employee information.
    private double hourlyWage;
    private int hoursPerWeek;
    private String jobSatisfaction;
    private double overtime;
    private String flexibility;
    private int addStress;

    // Constructor to initialize the full-time job attributes. It also calls the superclass (Job) constructor.
    public FullTimeJob(String companyName, String position, String startDate, String endDate, double hourlyWage, int hoursPerWeek, String jobSatisfaction, double overtime, String flexibility, int addStress)
     {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.jobSatisfaction = jobSatisfaction;
        
       // Ensure overtime is non-negative
       this.overtime = Math.max(overtime, 0);
        this.flexibility = flexibility;
        //make sure addes stress is not a negative
        this.addStress = Math.max(addStress, 0);
    }

    // Override the displayJobDetails method from Job to display details specific to a full-time job.
    @Override
    public void displayJobDetails() 
    {
        // Output job details for a full-time job
        System.out.println("Full-time Job at " + companyName + ": " + position + " from " + startDate + " to " + endDate);
    }

    // Override the calculateJobDuration method from Job to calculate the duration of the full-time job.
    @Override
    public int calculateJobDuration() 
    {
        // Simplified calculation based on the year difference between start and end dates.
        return (2024 - Integer.parseInt(startDate.substring(0, 4)));
    }

    // Override the assessJobSatisfaction method from Job to return job satisfaction specific to this full-time job.
    @Override
    public String assessJobSatisfaction() 
    {
        // Return employee job satisfaction for the full-time job.
        return jobSatisfaction;
    }

    // Additional methods specific to FullTimeJob

    // This method calculates the salary of the full-time job based on hourly wage and hours per week.
    public double calculateSalary() 
    {
        // Assuming 4 weeks per month.
        double salary =hourlyWage * hoursPerWeek * 4;
        salary += overtime;
        return salary;
    }

    // This method evaluates the work-life balance of the employee based on the number of hours worked per week.
    public String evaluateWorkLifeBalance()
     {
        // Determine work-life balance based on hours worked per week, flexibility and stress factors
        if (hoursPerWeek > 40 && addStress > 5 && flexibility =="low")
         {
            return "Poor";
        }
         else if (hoursPerWeek == 40 && addStress < 5 && flexibility =="medium")
         {
            return "Moderate";
        }
         else 
        {
            return "Excellent";
        }
    }
}
