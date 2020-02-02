import java.util.Date;

public class car {
    public String make;
    public String model;
    public int year;
    public int mileage;
    private Date lastOilChange;
    static int carsOutThere = 0;
    private boolean running;

    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.lastOilChange = new Date();
        this.running = false;
        carsOutThere++;
    }

    public String startYourEngine(String key) {
        if (key.equals("correct")) {
            return "vroom";
        }
        else return "...";
    }
}


