package org.musiquitous;

public class Hanoi {
  private static int numMoves;

  private static void moveDisks(int numDisks, String from, String to, String via) {
    if (numDisks > 1) {
      moveDisks(numDisks - 1, from, via, to);
    }

    System.out.println(String.format("* Move disk %d from %s to %s", numDisks, from, to));
    numMoves++;

    if (numDisks > 1) {
      moveDisks(numDisks - 1, via, to, from);
    }
  }

  public static void listMoves(int numDisks, String from, String to, String via) {
    numMoves = 0;

    System.out.println(String.format("How to move %d disks from the %s peg to the %s peg via the %s peg", numDisks, from, to, via));
    System.out.println(String.format("  (%d moves expected)", (int)Math.pow(2, numDisks) - 1));
    moveDisks(numDisks, from, to, via);
    System.out.println(String.format("  (%d moves performed)", numMoves));
  }
}
