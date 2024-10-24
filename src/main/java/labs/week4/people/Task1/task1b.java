package labs.week4.people.Task1;

public class task1b {
    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.Study();
        System.out.println("credits "+ olli.credits());
    }

}
