import edu.duke.*;
import org.apache.commons.csv.*;


public class ListExporters {
  public void listExporters(CSVParser parser, String exportOfInterest) {
    for (CSVRecord: parser) {
      String exports = record.get("Exports");
      if (exports.contains(exportOfInterest)) {
        String country = record.get("Country");
        System.out.println(country);
      }
    }
  }
}
