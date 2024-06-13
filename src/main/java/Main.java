import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        Set<String> carNames = new HashSet<>();

        for (int i = 1; i <= 3; i++) {
            String carName;
            int speed;

            while (true) {
                System.out.println("Введите название машины №" + i + ":");
                carName = scanner.nextLine().trim();
                if (carName.isEmpty()) {
                    System.out.println("Пустая строка. Введите название машины еще раз.");
                } else if (carNames.contains(carName)) {
                    System.out.println("Такая машина уже есть. Введите другое название машины.");
                } else {
                    carNames.add(carName);
                    break;
                }
            }

            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();
                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Скорость машины должна быть в диапазоне от 0 до 250 км в час. Попробуйте еще раз.");
                    }
                } else {
                    System.out.println("Неправильная скорость. Введите число.");
                    scanner.next();
                }
            }
            Car car = new Car(carName, speed);
            race.setLeader(car);
        }
        System.out.println("Самая быстрая машина: " + race.nameLeader);
        scanner.close();
    }
}
