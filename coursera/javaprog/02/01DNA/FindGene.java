/**
 * Find a gene in a DNA sequence
 *
 * @author Damian Satterthwaite-Phillips
 * @version 1.0.0
 */
public class FindGene {
  public static void main(String[] args) {
    testFindGene();
  }
  
  public static String findGene(String dna) {
    final String START = "ATG";
    final String STOP =  "TAA";
    String result = "";
    int startIndex = dna.indexOf(START);
    int stopIndex = dna.indexOf(STOP, startIndex + START.length());
    if (startIndex < 0 || stopIndex < 0) {
      return result;
    }
    result = dna.substring(startIndex, stopIndex + STOP.length());
    return result;
  }

  
  public static void testFindGene() {
    String dna = "AATGCGTAATATGGT";
    String gene = findGene(dna);

    dna = "AATGCTAGGGTAATATGGT";
    gene = findGene(dna);
    System.out.println("DNA strand is " + dna);
    System.out.println("Gene is " + gene);

    dna = "ATCCTATGCTTCGGCCTGCTCTAATATGGT";
    gene = findGene(dna);
    System.out.println("DNA strand is " + dna);
    System.out.println("Gene is " + gene);

    dna = "ATGTAA";
    gene = findGene(dna);
    System.out.println("DNA strand is " + dna);
    System.out.println("Gene is " + gene);

    dna = "TTAATT";
    gene = findGene(dna);
    System.out.println("DNA strand is " + dna);
    System.out.println("Gene is " + gene);
  }
}
