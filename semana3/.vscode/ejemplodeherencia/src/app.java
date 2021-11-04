public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Estudiante estudiante = 
             new Estudiante (1,"Juan","Perez");
        estudiante.edad = 25;
        estudiante.setNota (100);
        System.out.println(estudiante.toString());
    }
}
