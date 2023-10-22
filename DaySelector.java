
public class DaySelector {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday. Time to start a new workweek!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday. Keep the momentum going.");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday. Halfway through the workweek.");
                break;
            case THURSDAY:
                System.out.println("It's Thursday. The weekend is almost here.");
                break;
            case FRIDAY:
                System.out.println("It's Friday. Weekend is coming!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday. Time to relax and enjoy the weekend.");
                break;
            case SUNDAY:
                System.out.println("It's Sunday. A day for rest and relaxation.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
