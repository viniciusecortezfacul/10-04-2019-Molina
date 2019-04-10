
package aa9;

import java.util.ArrayList;
import java.util.List;


public abstract class SkilledEmployee extends Employee {
    private List<Skill>skills = new ArrayList();
    public SkilledEmployee (){
        super();
    }
    public SkilledEmployee(Area areaTrabalhada){
        super(areaTrabalhada);
        
    }
    
    public SkilledEmployee(String name, Area a ){
        super(name, a);
    }
    
   public SkilledEmployee(String name, Area a , float horas){
       super(name, a , horas);
   }
   public void addSkill(Skill nova) {
       this.skills.add(nova);
   }
    
    
    
}
