public class Jouer extends Membre{

    private int num;
    public int getNum() {
        return num;
    }

    public Jouer(int id ,String name,int num){
        super(id,name);
        this.num=num;
    }
    @Override
    public String toString(){
        return super.toString()+"\nnum="+num;
    }
}
