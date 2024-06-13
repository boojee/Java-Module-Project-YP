public class Race {
    String nameLeader = "";
    int leaderDistance = 0;

    void setLeader(Car car) {
        int distance = 24 * car.speed;
        if (nameLeader.isEmpty() || distance > leaderDistance) {
            nameLeader = car.carName;
            leaderDistance = distance;
        }
    }
}
