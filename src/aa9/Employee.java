
package aa9;

public abstract class Employee {
    private String name;
    private int id;
    private float horasTrabalhadas;
    private Area areaTrabalhada;
    private static int count = 0;
    
    
    private int setId(){
        return count++;
    }
    
    
    public Employee(Area areaTrabalhada){
        this();
        this.areaTrabalhada = areaTrabalhada;
    }
    
    
    public Employee(){
        this.id = setId();
    }
    public Employee(String name, Area a ){
        this(a);
        this.name = name;
    }
    
   public Employee(String name, Area a , float horas){
       this(name, a);
       this.horasTrabalhadas = horas;
   }
    
    
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public Area getAreaTrabalhada() {
        return areaTrabalhada;
    }

    public static int getCount() {
        return count;
    }
    
    
    
    
    
}
