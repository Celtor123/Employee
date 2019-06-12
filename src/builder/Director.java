package builder;

/**
 *
 * @author Celso
 */
public class Director extends Builder{

    @Override
    public void buildLastName() {
        employee.setLastName("Rodríquez");
    }

    @Override
    public void buildMiddleName() {
        employee.setMiddleName("Pérez");
    }

    @Override
    public void buildFirstName() {
        employee.setFirstName("Ignacio");
    }

    @Override
    public void buildId() {
        employee.setId(128352923);
    }

    @Override
    public void buildBirthYear() {
        employee.setBirthYear(1969);
    }

    @Override
    public void buildBirthMonth() {
        employee.setBirthMonth(2);
    }

    @Override
    public void buildBirthDate() {
        employee.setBirthDate(14);
    }

    @Override
    public void buildHireYear() {
        employee.setHireYear(1993);
    }

    @Override
    public void buildHireMonth() {
        employee.setHireMonth(7);
    }

    @Override
    public void buildHireDate() {
        employee.setHireDate(9);
    }

    
    
}
