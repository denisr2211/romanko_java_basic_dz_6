       /* ДЗ 6. Counter Strike

          1. ввести имя первой команды
          2. ввести количество фрагов для 5-ти игроков первой команды (т.е. должно быть 5 переменных)
          3. ввести имя второй команды
          4. ввести количество фрагов для 5-ти игроков второй команды (т.е. должно быть 5 переменных)
          5. подсчитать среднее арифметическое очков каждой команды
          6. сравнить результаты команд и определить победителя
          7. вывести в консоль:
             "Победила команда " + teamName + " набравшая " + result + " очков" */

public class Main {
    public static void main(String[] args) {
        String team1 = "Terrorist";
        double player1Terr = 3;
        double player2Terr = 4;
        double player3Terr = 12;
        double player4Terr = 1;
        double player5Terr = 5;

        double averageTeam1 = (player1Terr + player2Terr + player3Terr + player4Terr + player5Terr) / 5;

        String team2 = "Counter-Terrorist";
        double player1Count = 8;
        double player2Count = 2;
        double player3Count = 9;
        double player4Count = 14;
        double player5Count = 6;

        double averageTeam2 = (player1Count + player2Count + player3Count + player4Count + player5Count) / 5;

        if (averageTeam1 > averageTeam2) {
            System.out.println("Победила команда " + team1 + " набравшая " + averageTeam1 + " очков");
        } else  if (averageTeam1 < averageTeam2) {
            System.out.println("Победила команда " + team2 + " набравшая " + averageTeam2 + " очков");
        } else {
            System.out.println("Ничья");
        }
    }
}
