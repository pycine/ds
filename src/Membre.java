public class Membre {
    private int id;
    private String name;
    public Membre(int id,String name){
        this.name=name;
        this.id=id;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "id= "+this.id+"\nname="+this.name;
    }
//    @Override
//    public boolean equals(Object obj){
//        Membre other=(Membre) obj;
//        return other.name==name && other.id==id;
//
//    }
   @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Membre) || obj==null){
            return false;
        }
        Membre other=(Membre) obj;
        return other.name==name && other.id==id;

    }

}
