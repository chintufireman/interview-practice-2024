import java.util.Arrays;
import java.util.stream.Stream;

public class largestnumber {
    public static void main(String[] args) {
        String a[] =  {"3","30","34","5","9"};
    //     Arrays.sort(a, (n1,n2)->(n2+n1).compareTo(n1+n2));
    //    Stream<String> s = Arrays.stream(a);
    //     s.forEach(System.out::println);

            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    String n1 = a[i]+a[j];
                    String n2 = a[j]+a[i];
                    System.out.println(n1+"-" + n2+", n1-->n2 "+n1.compareTo(n2));
                    if(n1.compareTo(n2)<0){
                        String t = a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
            Arrays.stream(a).forEach(System.out::println);
    }
}
