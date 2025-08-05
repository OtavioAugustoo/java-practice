public record Square (double height, double base) implements GeometricForm {
    @Override
    public double getArea() {
        return height * base;
    }

}
