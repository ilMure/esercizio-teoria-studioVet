public class App {
    public static void main(String[] args) throws Exception {
        StudioVet vet = new StudioVet(3, 4);
        Thread t1 = new Animale("micio", vet, "gatto");
        Thread t2 = new Animale("Snoopy", vet, "cane");
        Thread t3 = new Animale("nero", vet, "gatto");
        Thread t4 = new Animale("cupcake", vet, "cane");
        Thread t5 = new Animale("sansone", vet, "cane");
        Thread t6 = new Animale("ringo", vet, "cane");
        Thread t7 = new Animale("birillo", vet, "gatto");
        Thread t8 = new Animale("fuffi", vet, "gatto");
        Thread t9 = new Animale("tigre", vet, "gatto");
        Thread t10 = new Animale("kira", vet, "cane");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


    }

}
