class Main {
    public static void main(String[] args) {
        OctoAnimal Octopus = new OctoAnimal("Purple", 8, 3, 9);
        Octopus.sayMyOcto();
        OctoAnimal Squid = new Squid("Orange", 6, 4, 7);
        Squid.sayMyOcto();
    }
}

class OctoAnimal {
    int octoArms, octoBrain, octoHeart;
    String camColor;

    public OctoAnimal(String camColor, int octoArms, int octoBrain, int octoHeart){
        this.camColor = camColor;
        this.octoArms = octoArms;
        this.octoBrain = octoBrain;
        this.octoHeart = octoHeart;
    }
    
    public void sayMyOcto(){
        System.out.println("Did you know octopuses can change into the color " + camColor);
        System.out.println(octoArms);
        System.out.println(octoBrain);
        System.out.println(octoHeart);
    }
}

class Squid extends OctoAnimal {
    public Squid(String camColor, int octoArms, int octoBrain, int octoHeart){
        super(camColor, octoArms, octoBrain, octoHeart);
    }
}
