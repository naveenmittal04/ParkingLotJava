package parkinglotjava.models;

import java.sql.Date;

public class Operator extends BaseModel {
    private String name;
    private String employeeId;
    public Operator(long id, Date createdAt, Date updatedAt, String name, String employeeId) {
        super(id, createdAt, updatedAt);
        this.name = name;
        this.employeeId = employeeId;
    }
    public Operator(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }    
}
