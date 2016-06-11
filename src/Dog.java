/**
 * Created by Makoto on 02.06.2016.
 */
public class Dog {
    private String name;
    private String says;

    private Dog (){
        name = "no name";
        says = "nothing";
    }

    public Dog(String name, String says){
        this.name = name;
        this.says = says;
    }

   /* public void getName(String name) return name;
    public void getSay(String says) return says;*/

    public void talk(){
            System.out.println("My name is "+name+" and i say "+says);
    }
}
