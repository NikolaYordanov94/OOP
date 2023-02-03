package WorkingWithAbstractionExercise.TrafficLights_04;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void changeColor(){
        switch (color){
            case RED:
                color = Color.GREEN;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
            case YELLOW:
                color = Color.RED;
                break;
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
