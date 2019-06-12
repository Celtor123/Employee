package builder;

/**
 *
 * @author Celso
 */
public abstract class Builder {
    protected Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void crearEmployee() {
        employee = new Employee();
    }
    
  
    public abstract void buildLastName();

    public abstract void buildMiddleName();

    public abstract void buildFirstName();

    public abstract void buildId();
    
    public abstract void buildBirthYear(); 

    public abstract void buildBirthMonth();

    public abstract void buildBirthDate();

    public abstract void buildHireYear();

    public abstract void buildHireMonth();

    public abstract void buildHireDate();
    
}

   