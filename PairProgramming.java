
/**
 * Write a description of class Namenliste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;

public class PairProgramming
{
    private Random zufallsgenerator;
    private ArrayList<String> namenliste;

    public PairProgramming()
    {
        zufallsgenerator = new Random(); 
        namenliste = erzeugeNamenliste();
    }

    public ArrayList<String> erzeugeNamenliste()
    {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Brandt Peggy");
        liste.add("Lang Robert");
        liste.add("Hoffmann Sibylle");
        liste.add("Frank Lars");
        liste.add("Roth Felix");
        liste.add("Krüger Kim");
        liste.add("Winkler Richard");
        liste.add("Baumann Dominic");
        liste.add("Beck Katrin");
        liste.add("Werner Nikola");
        liste.add("Kaiser Svetlana");
        liste.add("Friedrich Petra");
        return liste;
    }

    public static void main(String[] args)
    {
        PairProgramming liste = new PairProgramming();
        liste.teamsZusammenstellen();
    }

    // gib Namen aller anwesenden Mitarbeiter auf Konsole aus
    public void alleMitarbeiterAnzeigen()
    {
        for(String name : namenliste) {
            System.out.println(name);
        }
    }

    // Gib Namen eines Mitarbeiters oder null falls namenliste leer ist
    public String mitarbeiterAuslosen()
    {
        int listSize = namenliste.size();
        if(listSize >=1) {
            return namenliste.remove(zufallsgenerator.nextInt(listSize));
        }
        return null;
    }

    // Gib Namen zweier Mitarbeiters oder null falls namenliste.size() <2
    public String einTeamAuslosen()
    {
        if(namenliste.size() >=2) { 
            return mitarbeiterAuslosen() + " - " + mitarbeiterAuslosen();
        }
        return null;
    }

    public void teamsZusammenstellen()
    {
        System.out.println("\nTeam-Zusammenstellung für Pair-Programming");
        System.out.println("------------------------------------------");
        String team = "";
        while(namenliste.size() >=2){
            team =  einTeamAuslosen();
            System.out.println(team);
        }
        if(namenliste.size() != 0) {
            System.out.println("\nHerr " + namenliste.remove(0) + " möge sich einem der Teams anschließen");
        }
    }
}
