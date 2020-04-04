
package entities;

/**
 *
 * @author Andressa Silva
 */
public class Employee {
    
    public String name;
    public double salBruto;
    public double imposto;
    
    public double netSalary(){
        return salBruto - imposto;
    }
    
    public void increaseSalary(double percentage){        
        salBruto += salBruto * percentage / 100.0;
    }
    
    public String toString(){
        return name + ", " + String.format("%.2f", netSalary());
    }
}

