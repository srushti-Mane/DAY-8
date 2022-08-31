public class PartTimeEmployee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHour = 20;
        int fullDayHour = 8;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int dailyWage = 0;

        int employeeCheck = (int) (Math.random() * 10) % 2;
        if(employeeCheck == 1) {
            dailyWage = fullDayHour * wagePerHour;
            System.out.println("Employee is present");
            employeeCheck = (int) (Math.random() * ((2 + 0) + 1));

            if (employeeCheck == 2) {
                dailyWage = fullTimeHour * wagePerHour;
                System.out.println("Employee is present full time");
            } else if (employeeCheck == 1) {
                dailyWage = partTimeHour * wagePerHour;
                System.out.println("Employee is present half time");
            }
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Employee total wage is: " + dailyWage);
    }
}
