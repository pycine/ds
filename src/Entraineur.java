public class Entraineur extends Membre {
    private int exper;
    public Entraineur(int id ,String name,int exper){
        super(id,name);
        this.exper=exper;
    }
    @Override
    public  String toString(){

        return  super.toString()+"\nexper="+exper;
    }
}
