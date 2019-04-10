
package aa9;

import java.util.ArrayList;
import java.util.HashMap;
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
   public String listSkills() {
       String result = "";
       this.skills.get(this.skills.size()-1);
       int last = this.skills.size()-1;
       for(Skill n : this.skills){
           result += n.toString() + ((this.skills.get(last).equals(n)) ? " " : "," );
       }
       return result;
   }
   public String localizarSkills( String loc) {
       for(Skill a : this.skills){
           if(a.toString().endsWith(loc)) return a.toString();
       }
       return null;
   }
  
   
   
   
   
}
