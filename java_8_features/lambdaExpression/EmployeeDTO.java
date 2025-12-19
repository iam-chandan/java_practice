package java_8_features.lambdaExpression;

public class EmployeeDTO {
    private int id;
    private String name;

    public EmployeeDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
