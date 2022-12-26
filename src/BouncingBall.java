public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        //child is playing with a ball on nth floor, height of the floor above ground = h
        //he drops a ball out of the window
        //ball bounces with a height of for eg. 0.66
        //mother looks out of the window, with a height of 1.5 m for e.g (window variable)
        int numberOfSight = 0;
        if (h > 0 && bounce >= 0 && bounce < 1 && window < h) {
            double remainHigh = h;
            while (remainHigh > window) {
                remainHigh = remainHigh * bounce;
                numberOfSight += 2;
            }
            System.out.println(remainHigh);
        } else {
            return -1;
        }
        return numberOfSight - 1;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3, 0.66, 1.5));
    }
}
