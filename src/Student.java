public class Student  extends Studies{
    private double Area_o;
    Student () {
        super();
        Area_o = 0;}
    Student (String fType, double AreaValue) {
        super(fType);
        Area_o = AreaValue;}
    public void AreaSet(int AreaValue) {
        Area_o = AreaValue;}
    public double AreaValue() {
        return Area_o;}
    @Override
    public String toString() {
        return "Student {" +
                "Area_o=" + Area_o +
                "Type=" + getType() +
                '}';
    }
}