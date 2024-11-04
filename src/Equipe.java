import javax.sound.midi.SoundbankResource;

public class Equipe {
    public static int memberCount=0;
    private int id;
    private String name;
    private int size;

    private Membre[] membres;
    public Equipe(int size){
        this.size=size;
        membres=new Membre[size];
    }
    public void addMembre(Membre membre){
//        if (Search(membre)==-1){
//            System.out.println("membre already exist ");
//
//        }

        if (memberCount<membres.length ){
            if(Search(membre)==-1){
                membres[memberCount]=membre;
                memberCount++;
            }
            else System.out.println("Membre already exist");
        }
        else System.out.println("We can't add "+membre.getName()+" ! out of space");
    }
    public void display(){
        for (int i=0;i<memberCount;i++){
            System.out.println("Membre :"+(i+1)+"\n"+membres[i].toString());
        }
    }

    public int Search(Membre membre){
        for (int i=0;i<memberCount;i++){
            if (membre.equals(membres[i]))
                return i;

        }
        return -1;
    }

    public void Delete(Membre membre){
        int index=Search(membre);
        if (index!=-1){
            for(int i=index;i<memberCount-1;i++){
                membres[i]=membres[i+1];
            }
            membres[memberCount-1]=null;
            memberCount--;
            System.out.println("Deleted successfully");
        }
        else System.out.println("Membre doesn't exist");
    }
    @Override
    public String toString(){
        String list="";
        for (int i = 0; i <memberCount ; i++) {
            list=list+membres[i].getName()+"\n";

        }
        return name + id +"\n"+ list;

    }
    public void valider(){
        int c=0;
        for (int i = 0; i <memberCount ; i++) {
            if (membres[i] instanceof Entraineur)
                c++;
        }
        if (c==1){
            System.out.println("equipe valide");

        }
        else System.out.println("non valide");;

    }
    public void affichernum(){
        String numjouer;
        for (int i = 0; i <memberCount ; i++) {
            ((Jouer)membres[i]).getNum();
            if(membres[i] instanceof Jouer){
                System.out.println( ((Jouer) membres[i]).getNum());
            }
        }
    }

}
