public class Player {
    int health;
    int speed;
    String name;

    void run(){
        System.out.println(name + " is running at speed: " + speed);
    }

    boolean isDead(){
        return health <= 0;
    }
}


