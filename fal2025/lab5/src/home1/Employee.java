package home1;

    public class Employee {
        public String name;
        public String time;
        public int id;

        public Employee() {
            System.out.println("A default employee has been created");
        }

        public Employee(String name, int id, String time) {
            this.name = name;
            this.id = id;
            this.time = time;
        }
    }