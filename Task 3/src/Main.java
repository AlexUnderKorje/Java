public class Main {
    public static void main(String[] args){
        Movable mp = new MovablePoint(5,6,10,5);
        System.out.println(mp);
        mp.moveDown();
        System.out.println(mp);
        mp.moveRight();
        System.out.println(mp);
        Movable mc = new MovableCircle(2,1,2,20,20);
        System.out.println(mc);
        mc.moveDown();
        System.out.println(mc);
        mc.moveRight();
        System.out.println(mc);
        mc.moveLeft();
        System.out.println(mc);
        mc.moveUp();
        System.out.println(mc);
        Movable mr = new MovableRectangle(10,10,1,1,3,3);
        System.out.println(mr);
        mr.moveUp();
        mr.moveRight();
        System.out.println(mr);
        mr.moveDown();
        mr.moveLeft();
        System.out.println(mr);

    }
}
