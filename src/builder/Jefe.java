package builder;

/**
 *
 * @author Celso
 */
public class Jefe extends Builder{

    @Override
    public void buildLastName() {
        employee.setLastName("López");
    }

    @Override
    public void buildMiddleName() {
        employee.setMiddleName("Rossi");
    }

    @Override
    public void buildFirstName() {
        employee.setFirstName("Marco");
    }

    @Override
    public void buildId() {
        employee.setId(192837453);
    }

    @Override
    public void buildBirthYear() {
        employee.setBirthYear(1986);
    }

    @Override
    public void buildBirthMonth() {
        employee.setBirthMonth(12);
    }

    @Override
    public void buildBirthDate() {
        employee.setBirthDate(16);
    }

    @Override
    public void buildHireYear() {
        employee.setHireYear(2012);
    }

    @Override
    public void buildHireMonth() {
        employee.setHireMonth(4);
    }

    @Override
    public void buildHireDate() {
        employee.setHireDate(8);
    }

    
}
