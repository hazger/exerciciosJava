public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(necklace("nicole", "icolen"));
        System.out.println(necklace("nicole", "lenico"));
        System.out.println(necklace("nicole", "coneli"));
    }

    public static boolean necklace(String colar1, String colar2){
        if (colar1.length() != colar2.length()){
            return false;
        }
        colar1 += colar1;
        if (colar1.contains(colar2)){
            return true;
        }else{
            return false;
        }
    }
}
