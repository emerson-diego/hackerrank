import java.util.*;

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Checker implements Comparator<Player>{
    public int compare(Player a, Player b){

        // for comparison
        int scoreCompare = Integer.compare(b.score,a.score);
        int nameCompare = a.name.compareTo(
            b.name);

        // 2-level comparison
        return (scoreCompare == 0) ? nameCompare
                                  : scoreCompare;

    }

 
}
