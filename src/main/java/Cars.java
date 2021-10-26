import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static void main(String[] args) {

        List<Makes> models = new ArrayList<>();
        models.add(new Makes("Audi"));
        models.add(new Makes("Volvo"));
        models.add(new Makes("MG"));
        models.add(new Makes("Opel"));
        models.add(2, new Makes("VW"));
        int lastElement = models.size() ;
        models.add(lastElement,new Makes("Honda"));


        System.out.print(models);
        //System.out.println(models.get(0));
    }
}
