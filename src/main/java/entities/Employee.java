
package entities;

/**
 *
 * @author Andressa Silva
 */
public class Employee {
    
    public String name;
    public double salBruto;
    public double imposto;
    public double percentualAumento;
    
    public String toString(){
        return name + ", " + salBruto + ", " + imposto;
    }
    
    public double NetSalary(){
        return salBruto - imposto;
    }
    
    public double IncreaseSalary(){        
        return percentualAumento/100 * salBruto + NetSalary();
    }
}

// return salarioLiquido + (salarioLiquido * percentualAumento)
// PERCENTUAL DE AUMENTO = 10%
// vai ser 10/100 * salarioBruto + salario