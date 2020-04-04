
package entities;

/**
 *
 * @author Andressa Silva
 */
public class Employee {
    
    public String name;
    public double salBruto;
    public double imposto;
    
    public String toString(){
        return name + ", " + salBruto + ", " + imposto;
    }
}
