package WorkingWithAbstractionExercise.TrafficLights_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] signals = scanner.nextLine().split(" ");
        int iterations = Integer.parseInt(scanner.nextLine());
        List<TrafficLight> trafficLightList = new ArrayList<>();

        for(String signal : signals){
            Color color = Color.valueOf(signal);
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightList.add(trafficLight);
        }
        for (int i = 0; i < iterations; i++) {
            for (TrafficLight trafficLight : trafficLightList){
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
