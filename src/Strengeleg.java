import java.util.Scanner;

public class Strengeleg {
  String name;
  Scanner sc = new Scanner(System.in);

  public void go(){
    System.out.print("Skriv fornavn og efternavn: ");

    name =sc.nextLine();

    int index = name.indexOf(" ");

    String name1 = name.substring(0, index);

    String name2 = name.substring(index+1); //+1 så mellemrummet ikke kommer med

    System.out.println("Fulde navn " + name1 + " " + name2);

    System.out.println("Navn uden mellemrum " + name1 + name2);

    System.out.println("Forbogstav og efternavn " + name1.charAt(0) + ". " + name2);

    System.out.println("Initialer " + name1.charAt(0) + name2.charAt(0));

    //System.out.printf("%n%-20s%20","Navn : ",name1); //virker ikke, streng er malformed

    //System.out.printf("%n%-20s%20","Efternavn: ",name2);

    System.out.printf("%n%.2f%n", 8.888888); //newline og viser float/double med 2 decimaler.
    // %.2f er for float med 2 decimaler.

    System.out.printf("Week %d: %d litres.\n", 3, 6); //3 og 6 sættes ind på %d's pladser

    //sout.(ConsoleColors.ORANGE); når man skriver consolecolors kommer de forskellige farver frem i dropdown
    //farver virker ikke i command line, der udskriver den bare farvekoden før teksten
    //farvekoder: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

    //Math.min(6, 9) returnerer miste tal af de to
    //Math.max(7, 9) returnerer største tal

    char c = 'A';
    System.out.println((int)c); //- tager ASCII-værdien af A = 65. Typecasting
    //sout((int)c); - tager talværdien af c. Typecasting
    //sout((int)c + (int)a + (int)æ); - lægger tallene sammen. Lav " " imellem.
    //Den kan godt tage tegn fra andre sprog
    //skal typecasting bruges så lav en klasse/metode der specfikt gør det
  }

  public static void main(String[] args) {
    new Strengeleg().go();
  }
}


