public class UniversityTester {
    public static void main(String[] args) {
        University uni1 = new University();
        University uni2 = new University();

        System.out.println(uni1);
        System.out.println(uni2);
        uni1.name= "icl";
        uni1.country= "england";
        uni2.name= "bracu";
        uni2.country= "bd";
        System.out.println(uni1.name);
        System.out.println(uni1.country);
        System.out.println(uni2.name);
        System.out.println(uni2.country);
    }
}
