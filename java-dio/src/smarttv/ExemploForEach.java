package smarttv;

public class ExemploForEach {
    public static void main(String[] args) {
        
        String nomes []= {"Matheus ","Felipe", "Santos","Oliveira ", " Santos"};


        for (String nicks : nomes) {
            System.out.println(nicks);
       }

        for (int i = 0 ; i < nomes.length;i++ ) {

            System.out.println (i + " " + nomes[i]);
        }

        System.out.println(nomes[1]);
    }
}
