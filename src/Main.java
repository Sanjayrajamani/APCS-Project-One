//import processing.core.PApplet;
//
//public class Main extends PApplet {
//    Player player;
//    Obstacle obstacle;
//    House[] houses;
//    Road[] roads;
//
//    public static void main(String[] args) {
//        PApplet.main("Main");
//    }
//
//    public void settings() {
//        size(400, 400);
//    }
//
//    public void setup() {
//        player = new Player(50, height / 2);
//        obstacle = new Obstacle(width - 50, height / 2);
//
//        // Create houses and roads
//        houses = new House[2];
//        houses[0] = new House(100, height / 2);
//        houses[1] = new House(300, height / 2);
//
//        roads = new Road[2];
//        roads[0] = new Road(200, 200, 20, 200);
//        roads[1] = new Road(400, 200, 20, 200);
//    }
//
//    public void draw() {
//        background(220);
//        //  System.out.println("Game on");
//        text("Game on", 10,20);
//        player.display();
//        obstacle.display();
//
//        System.out.println( "ss");
//        for (House house : houses) {
//            text("Check House", house.x, house.y);
//            house.display();
//        }
//        for (Road road : roads) {
//            text("Check Road", road.x, road.y);
//
//            road.display();
//        }
//
//        player.move();
//        obstacle.move();
//
//        for (Road road : roads) {
//            if (player.collidesWith(road)) {
//                // Player is on a road, allow movement
//                player.allowMovement();
//                break;
//            } else {
//                // Player is not on a road, disallow movement
//                //  player.disallowMovement();
//            }
//        }
//
//        if (player.collidesWith(obstacle)) {
//            // Collision detected
//            background(255, 0, 0); // Change background to red on collision
//        }
//    }
//
//
//
//        void disallowMovement() {
//            canMove = false;
//        }
//
//        void allowMovement() {
//            canMove = true;
//        }
//
//        boolean collidesWith(Obstacle other) {
//            float d = dist(x, y, other.x, other.y);
//            return d < 20;
//        }
//
//        boolean collidesWith(Road road) {
//            return x > road.x && x < (road.x + road.width) && y > road.y && y < (road.y + road.height);
//        }
//    }
//
//    class Obstacle {
//        float x, y;
//        float speed = 1;
//
//        Obstacle(float x, float y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        void display() {
//            rect(x, y, 40, 40);
//        }
//
//        void move() {
//            x -= speed;
//            if (x < 0) {
//                x = width;
//                y = random(height);
//            }
//        }
//    }
//
//    class House {
//        float x, y;
//
//        House(float x, float y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        void display() {
//            rect(x, y, 40, 40);
//        }
//    }
//
//    class Road {
//        float x, y, width, height;
//
//        Road(float x, float y, float width, float height) {
//            this.x = x;
//            this.y = y;
//            this.width = width;
//            this.height = height;
//        }
//
//        void display() {
//            rect(x, y, width, height);
//        }
//    }
//}
