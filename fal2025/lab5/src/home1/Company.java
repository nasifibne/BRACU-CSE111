package home1;

public class Company {
    public Employee[] emp = new Employee[3];
    public int cap = 3;
    public int total;
    public String com = "ABC Company";

    public void details() {
        System.out.println("Company Name: " + com);
        System.out.println("Total Employee: " + total);
        System.out.println("Fulltime Employees: ");
        for (int i = 0; i < total; i++) {
            if (emp[i].time.equals("Fulltime")) {
                System.out.println("Name: " + emp[i].name + ", ID: " + emp[i].id);
            }
        }
        System.out.println("Part-Time Employees: ");
        for (int i = 0; i < total; i++) {
            if (emp[i].time.equals("Part-time")) {
                System.out.println("Name: " + emp[i].name + ", ID: " + emp[i].id);
            }
        }
    }

    public void addEmployee(Employee emp) {
        if (total < cap) {
            this.emp[total++] = emp;
            System.out.println(emp.name + " has joined the company");
        } else {
            System.out.println("No more vacancy");
        }
    }

    public void removeEmployee(Employee chk) {
        boolean flag = false;
        int temp = 0;
        for (int i = 0; i < total; i++) {
            if (emp[i] == chk) {
                flag = true;
                temp = i;
            }
        }
        if (flag) {
            emp[temp] = null;
            for (int i = temp; i < total-1; i++) {
                this.emp[i]  = this.emp[i+1];
            }
            total--;
            System.out.printf("%s has left the company\n",chk.name);
        }
    }
}
