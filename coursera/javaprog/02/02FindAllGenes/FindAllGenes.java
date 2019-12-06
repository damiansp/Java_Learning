public class FindAllGenes {
  final static String START_CODON = "ATG";
  final static String[] STOP_CODONS = {"TAA", "TAG", "TGA"};
  final static int CODON_LENGTH = 3;


  public static void main(String[] args) {
    testFindGene();
  }


  public static void findAllGenes(String dna) {
    int startIdx = 0;
    boolean geneFound = false;
    
    while (true) {
      String gene = findGene(dna, startIdx);
      if (gene.isEmpty()) {
        if (!geneFound) { System.out.println("No gene found."); }
        break;
      }
      System.out.println("Found gene: "
                         + gene
                         +  "; passes: "
                         + isMultipleOf(gene, CODON_LENGTH));
      geneFound = true;
      startIdx = dna.indexOf(gene, startIdx) + gene.length();
    }
  }
  
  public static String findGene(String dna, int where) {
    int startIdx = dna.indexOf(START_CODON, where);

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
                        "ATGTAAATGTAG", "TTAATT",
                        "ATGAGCTCTCGCTCTGAGATGCTCTCATGGTAGTTAGTTTAG"};

    for (String dna: testDNA) {
      System.out.println("DNA strand is " + dna);
      findAllGenes(dna);
    }
  }
}
