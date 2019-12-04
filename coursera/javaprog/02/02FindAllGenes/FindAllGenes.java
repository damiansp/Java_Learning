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
      
      if (idx > -1 && idx < endIdx) { endIdx = idx; }
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
    return -1;
  }


  public static boolean isMultipleOf(String str, int divisor) {
    boolean flag = str.length() % divisor == 0 ? true : false;
    return flag;
  }

  
  public static void testFindGene() {
    String[] testDNA = {"AATGCGCTAATATGGT", "ATCCTATGCTTCGGCCTGCTCTAATATGGTAG",
                        "ATGTAA", "TTAATT"};

    for (String dna: testDNA) {
      String gene = findGene(dna);
      
      System.out.println("DNA strand is " + dna);
      System.out.println(
        "Gene is " + gene +  "; passes: " + isMultipleOf(gene, CODON_LENGTH));
    }
  }
}
