public class Schoolkid extends Facility{
    private double Area;
    Schoolkid() {
        super();
        Area = 0;}
    Schoolkid(String fType, double AreaValue) {
        super(fType);
        Area = AreaValue;}
    public void AreaSet(int AreaValue) {
        Area = AreaValue;}
    public double AreaValue() {
        return Area;}
    @Override
    public String toString() {
        return "Student{" +
                "Area_o=" + Area +
                "Type=" + getType() +
                '}';}
}