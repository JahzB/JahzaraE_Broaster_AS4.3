//Jahzara Broaster

public class Main
 {
    public static void main(String[] args)
     {
        // Create an employee named John Doe
        Employee employee = new Employee("John Doe");

        // Create job instances with appropriate parameters
        FullTimeJob ftJob = new FullTimeJob("Walmart", "Software Engineer", "2018-01", "2022-01", 50.0, 40, "I didn't like the job", 23.00, "low", 3);
        PartTimeJob ptJob = new PartTimeJob("Amazon", "Consultant", "2020-01", "2023-01", 30.0, 20, "I Loved the Job and Flexible Hours");
        ContractJob ctJob = new ContractJob("TechCorp", "Software Engineer", "2020-01-01", "2024-01-01", 50.0, 160, "Satisfied", "High", false, -1);

        // Add jobs to employee's job history
        employee.addJob(ftJob);
        employee.addJob(ptJob);
        employee.addJob(ctJob);

        // Display job history and total work experience
        employee.displayJobHistory();
        System.out.println("Total Work Experience: " + employee.calculateTotalWorkExperience() + " years");
    }
}
