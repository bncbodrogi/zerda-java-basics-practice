package gardenterror;

public class App {
    public static void main(String[] args) {

        Flowers flower1 = new Flowers("blue");
        Flowers flower2 = new Flowers("yellow");
        Trees tree1 = new Trees("purple");
        Trees tree2 = new Trees("orange");
        System.out.println(flower1.waterStatusReport());
        System.out.println(flower2.waterStatusReport());
        System.out.println(tree1.waterStatusReport());
        System.out.println(tree2.waterStatusReport());

    }


}
