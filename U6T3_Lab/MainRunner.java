public class MainRunner {
    public static void main(String[] args) {
        String[] names = {"Mateo", "Sofia", "David", "Ziggy", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---------------------------"); 

        int[] nums = {8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println(total);

        System.out.println("---------------------------"); 

        Person p1 = new Person("Adam", 12);
        Person p2 = new Person("Barb", 15);
        Person p3 = new Person("Cathy", 14);
        Person p4 = new Person("Fred", 16);

        Person[] people = {p1, p2, p3, p4};
        for (Person one : people) {
            String name = one.getName().toUpperCase();
            one.setName(name);
            one.introduce();
        }

        System.out.println("---------------------------"); 

        int[] grades = {75, 80, 82, 78, 92};
        for (int i = 0; i < grades.length; i ++) {
            grades[i] += 5;
        }

        for (int grade : grades) {
            System.out.println(grade);
        }

    }
}