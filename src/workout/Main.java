package workout;

public class Main {
    public static void main(String[] args) {
        BasicWorkout[] demo = getDemoData();
        for (BasicWorkout bw: demo) {
            System.out.println(bw);
        }
    }

    public static BasicWorkout[] getDemoData(){
        return new BasicWorkout[] {
                new BasicWorkout(new Date(2018, 04, 1), 8200, 7, 1200, "Bike trip to Krems"),
                new BasicWorkout(new Date(2018, 05, 8), 1200, 5, 500, "Digging a hole")
                //new Running(new Date(2018, 05, 7), 3600, 12000, "Evening run from work to home"),
        };
    }
}
