package lesson6.task2_Report;

import java.util.List;
public class SaveToFile extends Print{
    @Override
    public void outputReport(List<ReportItem> items) {
          System.out.println("Output to textFile");
        for (ReportItem item : items) {
            System.out.format("textFile %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }  

}
