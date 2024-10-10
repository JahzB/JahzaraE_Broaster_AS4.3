public class PartTimeJob extends Job {
    // Declare attributes for part-time job and set to private to protect employee information.
    private double hourlyWage;
    private int hoursPerWeek;
    private String jobSatisfaction;

    // Constructor to initialize the part-time job attributes and call the superclass (Job) constructor.
    public PartTimeJob(String companyName, String position, String startDate, String endDate, double hourlyWage, int hoursPerWeek, String jobSatisfaction) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.jobSatisfaction = jobSatisfaction;
    }

    // Override the displayJobDetails method from Job to display details specific to a part-time job.
    @Override
    public void displayJobDetails() 
    {
        // Output job details for a part-time job
        System.out.println("Part-time Job at " + companyName + ": " + position + " from " + startDate + " to " + endDate);
    }

    // Override the calculateJobDuration method from Job to calculate the duration of the part-time job.
    @Override
    public int calculateJobDuration() 
    {
        // Simplified calculation based on the year difference between start and end dates.
        return (2024 - Integer.parseInt(startDate.substring(0, 4)));
    }

    // Override the assessJobSatisfaction method from Job to return job satisfaction specific to this part-time job.
    @Override
    public String assessJobSatisfaction() 
    {
        // Return employee job satisfaction for the part-time job.
        return jobSatisfaction;
    }

    // Additional methods specific to PartTimeJob

    // This method calculates the salary of the part-time job based on hourly wage and hours per week.
    public double calculateSalary() 
    {
        // Assuming 4 weeks per month.
        return hourlyWage * hoursPerWeek * 4;
    }

    // This method evaluates the work-life balance of the employee based on the number of hours worked per week.
    public String evaluateWorkLifeBalance() 
    {
        // Since it's a part-time job, work-life balance is typically good. 
        if (hoursPerWeek <= 20) 
        {
            return "Excellent";
        } 
        else 
        {
            return "Moderate";
        }
    }
}
