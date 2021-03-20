public class fizzbuzz {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        fizz_buzz(30);
    }

    public static void fizz_buzz(Integer limite){
        for(int i=1; i <= limite; i++){
            String retorno = "";
            if ( i % 3 == 0){
                retorno += "Fizz";
            }
            if ( i % 5 == 0){
                retorno += "Buzz";
            }
            if ( retorno == "" ){
                retorno = Integer.toString(i);
            }
            System.out.println(retorno);
        }
    }
}
