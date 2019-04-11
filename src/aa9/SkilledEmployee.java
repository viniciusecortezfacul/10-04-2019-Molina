
package aa9;

import java.util.ArrayList;
import java.util.LinkedList;
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
       int last = this.skills.size()-1;
       for(Skill n : this.skills){
           result += n.toString() + ((this.skills.get(last).equals(n)) ? " " : "," );
       }
       return result;
   }
    private String localizarSkill( String loc) {
       for(Skill a : this.skills){
           if(a.toString().equals(loc)) return a.toString();
       }
       return null;
   }
   
    public boolean temSkill(String skill){
           for(Skill a : this.skills){
               if(a.toString().equals(skill)) return true;
       }
       return false;
   }
   public void removerSkills(String loc){
       String removida = localizarSkill(loc);
       this.skills.remove(removida); 
   }
  
   
   
   
   
}
