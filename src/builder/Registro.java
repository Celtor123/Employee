package builder;

/**
 *
 * @author Celso
 */
public class Registro {
    private Builder builder;
    public void construir(){
        builder.crearEmployee();
        builder.buildFirstName();
        builder.buildMiddleName();
        builder.buildLastName();
        builder.buildId();
        builder.buildBirthDate();
        builder.buildBirthMonth();
        builder.buildBirthYear();
        builder.buildHireDate();
        builder.buildHireMonth();
        builder.buildHireYear();
    }

    public Employee getEmployee() {
        return builder.getEmployee();
    }

    public void setBuilder(Builder constructor) {
        builder = constructor;
    }
}
