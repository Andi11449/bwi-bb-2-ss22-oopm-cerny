package fridgeMap;


import java.util.Scanner;

public class FridgeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fridge fridge = new Fridge();

        System.out.println("1-put 2-take 3-printAll 4-stop");
        while (true) {
            System.out.println("Action: ");
            int action = Integer.parseInt(sc.nextLine());
            String[] line;
            switch (action){
                case 1:
                    System.out.println("Put: ");
                    line = sc.nextLine().split(" ");
                    fridge.put(line[0], Integer.parseInt(line[1]));
                    break;
                case 2:
                    System.out.println("Take: ");
                    line = sc.nextLine().split(" ");
                    fridge.take(line[0], Integer.parseInt(line[1]));
                    break;
                case 3:
                    System.out.println("ListAll: ");
                    fridge.listAll();
                    break;
                default:
                    return;
            }
        }

    }
}
