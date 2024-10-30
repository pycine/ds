//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Membre ali=new Membre(12711431,"ali");
        var yacine=new Membre(1271431,"Daoudi Med Yacine");
        System.out.println("#############################################");

        System.out.println(ali);
        System.out.println(ali.equals(yacine));
        System.out.println("######################################");
        var j1=new Jouer(12,"Oussema",17);
        System.out.println(j1);
        System.out.println("######################################");

        var e1 =new Entraineur(14,"Iyed",15);
        var e2 =new Entraineur(14,"Za3ter",15);
        System.out.println(e1);
        System.out.println("######################################");

        var equipe= new Equipe(4);

        System.out.println("######################################");
        System.out.println("######################################");

        equipe.addMembre(yacine);
        equipe.addMembre(j1);

        System.out.println( equipe.Search(yacine));
        System.out.println("######################################");
        System.out.println("######################################");

        equipe.addMembre(e1);
        equipe.addMembre(e2);

        //equipe.display();
        System.out.println(equipe.Search(e2));
        System.out.println(equipe.memberCount);


        //equipe.Delete(e2);
        System.out.println(equipe.Search(e2));
        System.out.println(equipe.memberCount);
        System.out.println(equipe);
        equipe.valider();


    }

}