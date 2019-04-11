
package aa9;

public class Editor extends SkilledEmployee{
    private EditType editType;
    
    
    public Editor (){
        super(Area.EDITOR);
    }
    public Editor(EditType editType){
        this.editType = editType;
    }
    
    public Editor(String name, Area a ){
        super(name, a);
    }
    
   public Editor(String name, Area a , float horas){
       super(name, a , horas);
   }

    public EditType getEditType() {
        return editType;
    }

    public void setEditType(EditType editType) {
        this.editType = editType;
    }
   
   
   
   
   
}
