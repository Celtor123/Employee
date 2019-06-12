package builder;

/**
 *
 * @author Celso
 */
public class Trabajador extends Builder{

    @Override
    public void buildLastName() {
        employee.setLastName("Sibert");
    }

    @Override
    public void buildMiddleName() {
        employee.setMiddleName("Simpson");
    }

    @Override
    public void buildFirstName() {
        employee.setFirstName("Josh");
    }

    @Override
    public void buildId() {
        employee.setId(123012319);
    }

    @Override
    public void buildBirthYear() {
        employee.setBirthYear(1989);
    }

    @Override
    public void buildBirthMonth() {
        employee.setBirthMonth(8);
    }

    @Override
    public void buildBirthDate() {
        employee.setBirthDate(2);
    }

    @Override
    public void buildHireYear() {
        employee.setHireYear(2005);
    }

    @Override
    public void buildHireMonth() {
        employee.setHireMonth(3);
    }

    @Override
    public void buildHireDate() {
        employee.setHireDate(1);
    }

    
    
}
