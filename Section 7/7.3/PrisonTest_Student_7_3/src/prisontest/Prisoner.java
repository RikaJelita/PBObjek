package prisontest;

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(String n, double h, int s){
    this.name = n;
    this.height = h;
    this.sentence = s;
    
   public void identity(String namanya, double tingginya, int kalimatnya){
   name = namanya;
   height = tingginya;
   sentence = kalimatnya;
}
}
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }   
}

