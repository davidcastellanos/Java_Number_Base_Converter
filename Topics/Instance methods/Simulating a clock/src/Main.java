
class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (hours == 12 && minutes == 59) {
            this.hours = 1;
            this.minutes = 0;
            //System.out.printf("%d:%d", hours, minutes);
        } else if (minutes == 59) {
            this.hours += 1;
            this.minutes = 0;
            //System.out.printf("%d:%d", hours, minutes);
        } else {
            this.minutes += 1;
            //System.out.printf("%d:%d", hours, minutes);
        }
    }

    /*public static void main(String[] args) {
        Clock clock = new Clock();
        clock.next();

    }*/
}