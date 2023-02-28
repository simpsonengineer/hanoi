import dev.simpsonengineer.Hanoi;

public class HanoiClient {
  public static void main(String[] args) {
    int numDisks = (args.length > 0) ? Integer.parseInt(args[0]) : 1;

    Hanoi.listMoves(numDisks, "left", "right", "middle");
  }
}