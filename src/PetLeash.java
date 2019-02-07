public class PetLeash {
    private static int numberOfLeashes = 0;

    private String manufacturer;
    private String color;
    private String mainMaterial;
    private String type;
    private int maxLengthInMeters;
    private int maxWeightInKilos;
    protected String state;
    protected boolean shouldBeSold;

    public PetLeash() {
        numberOfLeashes++;
        manufacturer = "Shenzhen";
        color = "black";
        mainMaterial = "nylon";
        type = "standard";
        maxLengthInMeters = 3;
        maxWeightInKilos = 30;
        state = "excellent";
        shouldBeSold = true;
    }

    public PetLeash(String manufacturer, int maxLengthInMeters, int maxWeightInKilos, String color) {
        this();
        this.manufacturer = manufacturer;
        this.maxLengthInMeters = maxLengthInMeters;
        this.maxWeightInKilos = maxWeightInKilos;
        this.color = color;
    }

    public  PetLeash(String manufacturer,
                     int maxLengthInMeters,
                     int maxWeightInKilos,
                     String color,
                     String mainMaterial,
                     String type,
                     String state,
                     boolean shouldBeSold) {

        this(manufacturer, maxLengthInMeters, maxWeightInKilos, color);
        this.mainMaterial = mainMaterial;
        this.type = type;
        this.state = state;
        this.shouldBeSold = shouldBeSold;
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void resetValues(String manufacturer,
                            String color,
                            String mainMaterial,
                            String type,
                            int maxLengthInMeters,
                            int maxWeightInKilos,
                            String state,
                            boolean shouldBeSold) {

        this.manufacturer = manufacturer;
        this.maxLengthInMeters = maxLengthInMeters;
        this.maxWeightInKilos = maxWeightInKilos;
        this.color = color;
        this.mainMaterial = mainMaterial;
        this.type = type;
        this.state = state;
        this.shouldBeSold = shouldBeSold;
    }

    public void toStr() {
        System.out.println("The manufacturer: " + this.manufacturer);
        System.out.println("The color: " + this.color);
        System.out.println("The main material: " + this.mainMaterial);
        System.out.println("The type: " + this.type);
        System.out.println("The maximal length (meters): " + this.maxLengthInMeters);
        System.out.println("The maximal weight (kilos): " + this.maxWeightInKilos);
        System.out.println("The state: " + this.state);
        System.out.println("Should be solved: " + this.shouldBeSold);
    }

    public static void printStaticNumberOfLeashes(){
        System.out.println("Current number of pet leashes: " + numberOfLeashes);
    };

    public void printNumberOfLeashes(){
        System.out.println("Current number of pet leashes: " + numberOfLeashes);
    };
}
