
package aa9;

public enum ToolsUsed {
    PHOTOSHOP{
        @Override
        public String toString(){
            return "Photoshop";
        }
        
        
    }, ILUSTRATOR{
        @Override
        public String toString(){
            return "Ilustrator";
        }
        
    }
    , DRAWNING_TABLET {
        
        @Override
        public String toString(){
            return "Drawning Tablet";
        }
    }
}
