
package aa9;

import java.util.ArrayList;
import java.util.List;


public class Manager extends Employee {
    private List<Employee> funcionarios = new ArrayList();
    public Manager (){
        super();
    }
    public Manager(Area areaTrabalhada){
        super(areaTrabalhada);
        
    }
    
    public Manager(String name, Area a ){
        super(name, a);
    }
    
   public Manager(String name, Area a , float horas){
       super(name, a , horas);
   }
   
   public void addEmployee(Employee e){
       this.funcionarios.add(e);
   }
   
   public String listEmployees() {
       String result = "";
       for(Employee e : this.funcionarios){
           result += this.funcionarios.toString() + "\n";
       }
       return result;
   }
   public Employee localizarEmployee(int id){
       for(Employee e : this.funcionarios){
           if(id == e.getId()) { 
               return e;
           }
       }
       return null;
   }
   
   public void removerEmployee(int id){
       this.funcionarios.remove(localizarEmployee(id));
   }
   
    
    
    
}
