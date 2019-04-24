public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();

        Robot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        Robot robotDancer = new RobotDancer();
        robotDancer.work();

        Robot robotCoocker = new RobotCoocker();
        robotCoocker.work();
    }
}
