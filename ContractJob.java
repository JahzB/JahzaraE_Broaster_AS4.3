
// ContractJob class that extends the abstract class Job
public class ContractJob extends Job {
    // Declare attributes for contract job and set them to private to secure employee information
    private double hourlyRate;
    private int hoursWorked;
    private String jobSatisfaction;
    private String companyStability; // Now a String to represent "High", "Medium", or "Low"
    private boolean hasTerminationClause; // Represents whether there's a termination clause
    private double additional; //penalties or bonouses in dollars

    // Constructor to initialize attributes specific to ContractJob class and call the superclass (Job) constructor
    public ContractJob(String companyName, String position, String startDate, String endDate, double hourlyRate, int hoursWorked, String jobSatisfaction, String companyStability, boolean hasTerminationClause, double additional) 
    {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.jobSatisfaction = jobSatisfaction;
        this.companyStability = companyStability;
        this.hasTerminationClause = hasTerminationClause;
        this.additional = additional;
    }

    // Override the displayJobDetails method from Job to display details specific to a contract job
    @Override
    public void displayJobDetails() 
    {
        // Output job details for a contract job
        System.out.println("Contract Job at " + companyName + ": " + position + " from " + startDate + " to " + endDate);
    }

    // Override the calculateJobDuration method from Job to calculate the duration of the contract job
    @Override
    public int calculateJobDuration()
     {
        // Simplified calculation based on the year difference between start and end dates
        return (2024 - Integer.parseInt(startDate.substring(0, 4)));
    }

    // Override the assessJobSatisfaction method from Job to return job satisfaction specific to the contract job
    @Override
    public String assessJobSatisfaction() 
    {
        return jobSatisfaction;
    }

    // Additional methods specific to ContractJob

    // This method calculates the payment for the contract job based on the hourly rate and hours worked
    public double calculatePayment() 
    {
        double payment =hourlyRate * hoursWorked;
        payment += additional;
        return payment;
    }

    // This method evaluates the level of job security based on the company's stability, the termination clause, and the job duration
    public String evaluateJobSecurity() {
        int duration = calculateJobDuration(); // Get the job duration in years

        if (companyStability.equalsIgnoreCase("High") && !hasTerminationClause && duration > 2) {
            return "High";
        } else if ((companyStability.equalsIgnoreCase("Medium") && duration >= 1) || (companyStability.equalsIgnoreCase("High") && hasTerminationClause && duration >= 1)) {
            return "Medium";
        } else {
            return "Low";
        }
    }
}
