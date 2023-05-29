package lesson6.task2_Report;

import java.util.List;
public class PrintReport implements PrintAll{
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }  
}
