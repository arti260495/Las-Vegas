public class Casino {

    public int playToPoker() {
        int i = (int) (Math.random() * 2);
        if (i == 0) {
            System.out.println("Покер - проигрыш");
        }
        else System.out.println("Покер - выигрыш");
        return i;
    }
    @MyAnnotation
    public int playToRoulete() {
        int i = (int) (Math.random() * 2);
        if (i == 0) {
            System.out.println("Рулетка - проигрыш");
        }
        else System.out.println("Рулетка - выигрыш");
        return i;
    }

    public int playToSlotMachine() {
        int i = (int) (Math.random() * 2);
        if (i == 0) {
            System.out.println("Игровой автомат - проигрыш");
        }
        else System.out.println("Игровой автомат - выигрыш");
        return i;
    }
    @MyAnnotation
    public int playToBlackJack() {
        int i = (int) (Math.random() * 2);
        if (i == 0) {
            System.out.println("Блэкджэк - проигрыш");
        }
        else System.out.println("Блэкджэк - выигрыш");
        return i;
    }

    public int playToWheelOfFortune() {
        int i = (int) (Math.random() * 2);
        if (i == 0) {
            System.out.println("Колесо фортуны - проигрыш");
        }
        else System.out.println("Колесо фортуны - выигрыш");
        return i;
    }
    @MyAnnotation
    public int playToBaccarat() {
        int i = (int) (Math.random() * 2);
        if (i == 0) {
            System.out.println("Баккара - проигрыш");
        }
        else System.out.println("Баккара - выигрыш");
        return i;
    }


}
