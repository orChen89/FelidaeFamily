public class Main {

    public static void main(String[] args) {

        Lion l = new Lion(200,1.25f, false, FurColor.ORANGE);

        Felidae[] fel = new Felidae[3];
        fel[0] = new Lion(150, 1.00f, true, FurColor.WHITE);
        fel[1] = new Cat(30.2f, 60.1f, true, FurColor.BLACK);
        fel[2] = new Feline(15.6f, 10.8f, false, FurColor.ORANGE);

        for (int i = 0; i < fel.length; i++) {

            System.out.println();
            System.out.println(fel[i]);
            System.out.println();
            fel[i].bite("");
            System.out.println();
            fel[i].workForFood("");
            System.out.println();
            System.out.println(l);
            l.Roar();

        }

    }
}