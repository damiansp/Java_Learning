public class FindAllGenes {
  final static String START_CODON = "ATG";
  final static String[] STOP_CODONS = {"TAA", "TAG", "TGA"};
  final static int CODON_LENGTH = 3;


  public static void main(String[] args) {
    testFindGene();
  }

  
  public static String findGene(String dna) {
    int startIdx = dna.indexOf(START_CODON);

    if (startIdx == -1) { return ""; }    
    int endIdx = dna.length();

    for (String stopCodon: STOP_CODONS) {
      int idx = findStopCodon(dna, startIdx, stopCodon);
      
      if (idx < endIdx) { endIdx = idx; }
    }

    if (endIdx == dna.length()) { return ""; }
    return dna.substring(startIdx, endIdx + CODON_LENGTH);
  }


  public static int findStopCodon(String dna, int startIdx, String stopCodon) {
    int currIdx = dna.indexOf(stopCodon, startIdx);

    while (currIdx != -1) {
      if ((currIdx - startIdx) % 3 == 0) { return currIdx; }
      currIdx = dna.indexOf(stopCodon, currIdx + 1);
    }
    return dna.length();
  }

  public static void testFindGene() {
    String dna = "AATGCGTAATATGGT";
    String gene = findGene(dna);

    dna = "AATGCTAGGGTAATATGGT";
    gene = findGene(dna);
    System.out.println("DNA strand is " + dna);
    System.out.println("Gene is " + gene);

    dna = "ATCCTATGCTTCGGCCTGCTCTAATATGGTAG";
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
