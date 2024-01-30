package practice_stream_api_ex;

public class EmployeeSalaryExample {
    public static void main(String[] args) {
        // Creating a list of employees with id as key and salary as value
//        List<Employee> x = new ArrayList<>();
//        x.add(new Employee(1,"manju"));
//        x.add(new Employee(2,"ananda"));
//
//        Map<Integer,String> y =x.stream()
//                .collect(Collectors.toMap(Employee::getId,Employee::getName));
//        System.out.println(y);

//        List<Employee> x = new ArrayList<>();
//        x.add(new Employee(1, "manju",15000.0));
//        x.add(new Employee(2, "anand",20000.0));
//
//        Map<Integer, String> y = x.stream()
//                .collect(Collectors.toMap(Employee::getId, Employee::getName));
//
//        // Displaying the result
//        y.forEach((id, name) -> System.out.println("Employee ID: " + id + ", Employee Name: " + name));
    }

    public static class Food {
        private String food;
        private String foodName;
        private long price;

        public String getFood() {
            return food;
        }

        public String getFoodName() {
            return foodName;
        }

        public long getPrice() {
            return price;
        }

        public Food(String food, String foodName, long price) {
            this.food = food;
            this.foodName = foodName;
            this.price = price;
        }
    }
}
