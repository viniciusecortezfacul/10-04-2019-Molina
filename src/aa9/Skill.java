
package aa9;

public enum Skill {
    EDITAR{
        @Override
        public String toString(){
            return "Editar";
        }
    }, ILUSTRAR{
        @Override
        public String toString(){
            return "Ilustrar";
        }
    }, 
        ESCREVER {
        @Override
        public String toString(){
            return "Escrever";
        }
    }
}
