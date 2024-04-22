package Composite;

public class Main {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1,"sales dep");
        Department financialDepartment = new SalesDepartment(1,"financial dep");
        HeadDepartment headDepartment = new HeadDepartment(2,"head dep 2");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
