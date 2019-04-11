
package aa9;

import java.util.ArrayList;
import java.util.List;


public class GraphicIllustrator extends SkilledEmployee {
    List<ToolsUsed> tools = new ArrayList();
    public GraphicIllustrator (){
        super();
    }
    public GraphicIllustrator(Area areaTrabalhada){
        super(areaTrabalhada);
        
    }
    
    public GraphicIllustrator(String name, Area a ){
        super(name, a);
    }
    
   public GraphicIllustrator(String name, Area a , float horas){
       super(name, a , horas);
   }
   
   
   
   public List<ToolsUsed> getToolsUsed(){
       return tools;
   }
    
    
    
    
    
    
}
