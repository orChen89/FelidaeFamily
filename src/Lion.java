public class Lion extends Felidae {

    private boolean isAlpha;

    public Lion (float weight, float tailLength, boolean isAlpha, FurColor furColor) {
        super(weight, tailLength,furColor);
        this.isAlpha = isAlpha;
    }

    public void bite(String b){

        System.out.println("This Lion is Biting!!!");
    }
    public void workForFood(String w){

        System.out.println("This Lion is lazy and it doesn't work for its food!");
    }

    public void Roar(){

        System.out.println("This Lion is Roaring right now!");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "furColor=" + furColor +
                ", weight=" + weight +
                ", tailLength=" + tailLength +
                ", isAlpha=" + isAlpha +
                '}';
    }

    public void setAlpha(boolean alpha) {
        isAlpha = alpha;
    }

       }


