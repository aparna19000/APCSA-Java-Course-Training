package ACP;

class Wonder {
    void display() {
        System.out.println("Seven Wonders of the World");
    }
}

class TajMahal extends Wonder {
    void display() {
        System.out.println("Taj Mahal - India");
    }
}

class GreatWall extends Wonder {
    void display() {
        System.out.println("Great Wall of China - China");
    }
}

class Petra extends Wonder {
    void display() {
        System.out.println("Petra - Jordan");
    }
}

class ChristRedeemer extends Wonder {
    void display() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}

class MachuPicchu extends Wonder {
    void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

class ChichenItza extends Wonder {
    void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

class Colosseum extends Wonder {
    void display() {
        System.out.println("Colosseum - Italy");
    }
}

public class SevenWonder {
    public static void main(String[] args) {

        Wonder w;

        w = new TajMahal();
        w.display();

        w = new GreatWall();
        w.display();

        w = new Petra();
        w.display();

        w = new ChristRedeemer();
        w.display();

        w = new MachuPicchu();
        w.display();

        w = new ChichenItza();
        w.display();

        w = new Colosseum();
        w.display();
    }
}