public class Monitor {
    int resolution;

    public Monitor(int resolution) {
    this.resolution = resolution;
    }
    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + " x " + y + " in color " + color);
    }
}
