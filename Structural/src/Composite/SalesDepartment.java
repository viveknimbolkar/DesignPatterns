package Composite;

public class SalesDepartment implements  Department{
    private String name;
    private Integer id;
    public SalesDepartment(Integer id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void printDepartmentName(){
        System.out.println("sales department");
    }
}
