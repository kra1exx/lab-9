public class Car extends Auto {
    private String model;
    private int numDoors;
    private Boolean fullTime;
    private String gosNum;
    public Car() {
        super();
        model = "";
        numDoors = 4;
        fullTime = false;
        gosNum = "";}
    public Car(String firma, int speed, String name, int n, Boolean f, String num) {
        super(firma, speed);
        model = name;
        numDoors = n;
        fullTime = f;
        gosNum = num;}
    public void setModel(String name) {
        model = name;}
    public String getModel() {
        return model;}
    public void setNumDoors(int n) {
        numDoors = n;}
    public int getNumDoors() {
        return numDoors;}
    public Boolean isFullTime() {
        return fullTime;}
    public void setGosNum(String str) {
        gosNum = str;}
    public String getGosNum() {
        return gosNum;}
    public String toString() {
        return getFirm() + " " + getMaxSpeed() + " " + model + " " + numDoors + " " + fullTime + " " + gosNum;}
}