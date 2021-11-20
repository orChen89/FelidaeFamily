 enum FurColor{

 RED, BLUE, YELLOW, ORANGE, WHITE, BLACK, GREEN, BROWN;

    }

  public abstract class Felidae {

      protected FurColor furColor;
      protected float weight;
      protected float tailLength;


    public Felidae(float weight, float tailLength, FurColor furColor) {
        this.weight = weight;
        this.tailLength = tailLength;
        this.furColor = furColor;

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getTailLength() {
        return tailLength;
    }

    public void setTailLength(float tailLength) {
        this.tailLength = tailLength;
    }

    public abstract void bite(String b);

    public abstract void workForFood(String w);

    }
