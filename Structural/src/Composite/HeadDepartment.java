package Composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
    private Integer id;
    private String name;
    private List<Department> childDepartments;


    public HeadDepartment(int id, String name){
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void addDepartment(Department dep){
        childDepartments.add(dep);
    }

    public void removeDepartment(Department dep){
        childDepartments.remove(dep);
    }
    @Override
    public void printDepartmentName(){
        childDepartments.forEach(Department::printDepartmentName);
    }
}
