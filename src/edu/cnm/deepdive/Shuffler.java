package edu.cnm.deepdive;

import java.util.Random;


/**
 * Simple array shuffling class. Since {@link java.util.Arrays} does not implement a {@code shuffle}
 * method (the {@link java.util.Collections} class does), this addresses that with a basic
 *implementation of the Fisher-Yates shuffling algorithm.
 */
public class Shuffler {

  private final Random rng;


  /**
   * Initializes this instance with the provided source of (pseudo-) randomness.
   * @param rng random number generator
   */
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  /**
   * Shuffles the values of an integer array
   * @param data array to be shuffled.
   */
  public void shuffle(int[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      int temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * Shuffles the values of a byte array
   * @param data
   */
  public void shuffle(byte[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      byte temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * SHuffles the values of a double array
   * @param data
   */
  public void shuffle(double[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      double temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * Shuffles the values of a float array
   * @param data array to be shuffled.
   */
  public void shuffle(float[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      float temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * Shuffles the values of a char array
   * @param data array to be shuffled.
   */
  public void shuffle(char[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      char temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * Shuffles the values of a generic array
   * @param data array to be shuffled.
   * @param <T> array element type.
   */
  public <T> void shuffle(T[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      T temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;
    }
  }

  public void shuffle(short[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      short temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  public void shuffle(long[] data) {
    for (int dest = data.length - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      long temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }
}
