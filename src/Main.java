public class Main {
    public static void main(String[] args) {
var dog = 8.0;
var cat = 3.6;
var paper = 763789;
System.out.println(dog);
System.out.println(cat);
System.out.println(paper);
dog = dog + 4;
System.out.println(dog);
cat = cat + 4;
System.out.println(cat);
paper = paper + 4;
System.out.println(paper);
dog = dog - 3.5;
System.out.println(dog);
cat = cat - 1.6;
System.out.println(cat);
paper = paper - 7639;
System.out.println(paper);

var friend = 19;
System.out.println(friend);
friend = friend + 2;
System.out.println(friend);
friend = friend / 7;
System.out.println(friend);

var frog = 3.5;
System.out.println(frog);
frog = frog * 10;
System.out.println(frog);
frog = frog / 3.5;
System.out.println(frog);
frog = frog + 4;
System.out.println(frog);

var firstBoxerWeight = 78.2;
var secondBoxerWeight = 82.7;
var totalWeight = firstBoxerWeight + secondBoxerWeight;
System.out.println("Общий вес боксеров " + totalWeight + " кг");
var weightDifference = firstBoxerWeight - secondBoxerWeight;
System.out.println("Разница в весе " + weightDifference);

var differenceInWeight = secondBoxerWeight % firstBoxerWeight;
System.out.println("Разница в весе " + differenceInWeight);

var totalWorkingHours = 640;
var workingHoursOneWorker = 8;
var numberWorkers = totalWorkingHours / workingHoursOneWorker;
System.out.println("Всего работников в компании - " + numberWorkers + " человек");

var numberWokers2 = numberWorkers + 94;
var totalWorkingHours2 = numberWokers2 * workingHoursOneWorker;
System.out.println("Если в компании работает " + numberWokers2 + " человек, то всего " + totalWorkingHours2 + " часов работы может быть поделено между сотрудниками");


    }
}