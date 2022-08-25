public class School {

    public static void main(String[] args) {
       Student anna = new Student();
       Student claus = new Student();

        claus.setCpr(1234);
        anna.setCpr(3333);


        System.out.println(claus.getCpr());
        System.out.println(anna.getCpr());




    }


}
