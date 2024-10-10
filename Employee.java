import java.util.ArrayList;

// Employee class that will maintain a history of the employee's jobs
public class Employee {
    // Declare objects and set to private to protect user information
    private String name;
    private ArrayList<Job> jobHistory;

    // Constructor
    public Employee(String name) {
        this.name = name;
        // Store array of job history
        this.jobHistory = new ArrayList<>();
    }

    // Method to allow user to add a job to job history
    public void addJob(Job job) {
        jobHistory.add(job);
    }

    // Method to display the job history of an employee
    public void displayJobHistory() {
        if (jobHistory.isEmpty()) {
            System.out.println(name + " has no job history.");
            return;
        }
        
        for (Job job : jobHistory) {
            job.displayJobDetails();
            System.out.println("Job Duration: " + job.calculateJobDuration() + " years");
            System.out.println("Job Satisfaction: " + job.assessJobSatisfaction());
            System.out.println(); // Add a line for better readability
        }
    }

    // Method to calculate employee total work experience based on years worked
    public int calculateTotalWorkExperience() {
        int totalYears = 0;
        for (Job job : jobHistory) {
            totalYears += job.calculateJobDuration();
        }
        return totalYears;
    }
}
