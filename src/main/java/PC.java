public class PC {

    public PC(String Case, String motherboard, String monitor){

    }

    private void drawLogo(){
        Monitor monitor1 = new Monitor(1920);
        monitor1.drawPixel(1920, 1080, "red");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
    }
    public void powerUp(){
        Case Frost1 = new Case();
        MotherBoard b450 = new MotherBoard();
        Frost1.pressPowerButton();
        drawLogo();
        b450.loadProgram("Windows 10 pro");
    }
}
