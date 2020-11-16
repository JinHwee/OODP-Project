package entities;

public class Lecture extends Lesson{
    private static int count = 2;

    public Lecture(String lessonType, String venue, String startTime, String endTime, int day) {
        super("Lec", venue, startTime, endTime, day);
        --count;
    }

    @Override
    public boolean modifyTiming(String startTimeNew, String endTimeNew, int day) {
        try {
            this.timings = new WorkingHours(startTimeNew, endTimeNew, day);
            return true;
        } catch (IllegalArgumentException e){
            System.out.println("Timings are not valid.");
            return false;
        }
    }

    @Override
    public boolean modifyVenue(String newVenue) {
        return false;
    }
}