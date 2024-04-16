import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Vali v = (Vali) new Validate();
        Scanner sc = new Scanner(System.in);

        List<Student> list = new ArrayList<>();
        list.add(new Student("Nguyen van a", 19, 8.5));
        list.add(new Student("Nguyen van b", 17, 6.5));
        list.add(new Student("Nguyen van c", 21, 7.5));
        list.add(new Student("Nguyen van d", 30, 8.5));
        list.add(new Student("Nguyen van e", 29, 9.0));

        while (true) {
            int index = 0;
            int choice = 0;
            System.out.println("input choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    v.add(list);
                    break;
                case 2:
                    v.display(list);
                    break;
                case 3:
                    System.out.println("input remove index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.remove(list,index);
                    break;
                case 4:
                    System.out.println("input edit index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.edit(list,index);
                    break;

            }
        }

    }
}
