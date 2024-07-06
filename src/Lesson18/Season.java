package Lesson18;

public enum Season {
    SUMMER(30), WINTER(-30), SPRING(10), AUTUMN(15);

    private int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}
