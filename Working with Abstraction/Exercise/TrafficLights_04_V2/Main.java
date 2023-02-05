package WorkingWithAbstractionExercise.TrafficLights_04_V2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] colors = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightList = new ArrayList<>();

        for (String signal : colors){
            Color newColor = Color.valueOf(signal);
            TrafficLight trafficLight = new TrafficLight(newColor);
            trafficLightList.add(trafficLight);
        }

        for (int i = 0; i < n; i++) {
            for (TrafficLight trafficLight : trafficLightList){
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();

        }
    }
}
