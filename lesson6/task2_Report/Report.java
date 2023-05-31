package lesson6.task2_Report;
import java.util.ArrayList;
import java.util.List;
//import lesson6.task2_Report.PrintAll;
public class Report {
    
    private List<ReportItem> items; // Отчетные данные
    
        // расчет отчетных данных
        public void calculate(){
            items =  new ArrayList<ReportItem>();
            items.add(new ReportItem("First", (float)5));
            items.add(new ReportItem("Second", (float)6));
        }
    
     
            public void output(Print print){
                
                print.outputReport(items);
            }
      

    
}
