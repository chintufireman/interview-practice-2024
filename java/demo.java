class demo extends Test2{

    demo(){
        System.out.println("2");
    }
    public static void main(String[] args) {

        //imp question below
        // Integer n1 = 100;
        // Integer n2 = 100;
        // Integer n3 = 1000;
        // Integer n4 = 1000;
        // Integer n5 = new Integer(60);
        // Integer n6 = new Integer(60);
        // System.err.println(n5.equals(n6));
        // System.err.println(n1 ==n2);
        // System.err.println(n5 ==n6);
        // System.err.println(n3.equals(n4));
        // System.out.println();

        //new question 
        //Test te= new Test();
        //System.out.println(te.data);

        //another question
        demo d = new demo();
        System.out.println(s);
    }

    // static int add() {
    //     return 12;
    // }

    // static double add() {
    //     return 10;
    // }
}

class Test{
    private int data;
    Test(){
        data=5;
    }
}
class Test2{
    static String s = "Super class";
    Test2(){
        System.out.println("1");
    }
}