/* Fazer um programa para ler os dados de um funcionário (nome, salario bruto e imposto).
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem 
 * dada (somente o salário bruto é afetado pela porcentagem)
 * e mostrar novamente os dados do funcionário.
 * Nome: Joao Silva, Salary: 6000.00, Imposto: 1000.00
 * 
 * Use a classe projetada abaixo. 
 */
package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
                 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
    
        System.out.print("Informe nome: ");
        employee.name = sc.nextLine();
        System.out.print("Informe salario bruto: ");
        employee.salBruto = sc.nextDouble();
        System.out.print("Informe o imposto a ser pago: ");
        employee.imposto = sc.nextDouble();
        
        System.out.println("");
        
        System.out.println(employee.name + " salario liquido = R$ " + employee.NetSalary());
        
        System.out.println("");
        
        System.out.println("Informe o percentual de aumento do salario: (%)");
        employee.percentualAumento = sc.nextDouble();
        
        System.out.println("");
        
        System.out.println(employee.name + ", Salario bruto: R$ " + employee.salBruto + ", Salário líquido: R$ " + employee.IncreaseSalary() + ", Imposto: R$ " + employee.imposto);
                
              
    }
}
