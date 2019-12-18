import java.io.*;

import edu.duke.*;
import org.apache.commons.csv.*;


public class CSVMax {
  public CSVRecord hottestHourInFile(CSVParser parser) {
    CSVRecord largestSoFar = null;

    for (CSVRecord currentRow: parser) {
      if (largestSoFar == null) { largestSoFar = currentRow; }
      else {
        double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
        double largestTemp = Double.parseDouble(
          largestSoFar.get("TemperatureF"));
        if (currentTemp > largestSoFar) { largestSoFar = currentRow; }
      }
    }
    return largestSoFar;
  }


  public CSVRecord hottestInManyDays() {
    CSVRecord largestSoFar = null;
    DirectoryResource dr = new DirectoryResource();

    for (File f: dr.selectedFiles()) {
      FileResource fr = new FileResource(f);
      CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());

      if (largestSoFar == null) { largestSoFar == currentRow; }
      else {
        double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
        double largestTemp = Double.parseDouble(
          largestSoFar.get("TemperatureF"));
        if (currentTemp > largestSoFar) { largestSoFar = currentRow; }
      }
    }
    return largestSoFar;
  }
}
