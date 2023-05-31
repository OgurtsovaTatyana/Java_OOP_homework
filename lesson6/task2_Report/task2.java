package lesson6.task2_Report;

public class task2 {
   
    public static void main(String[] args) {
            Report report = new Report();
            report.calculate();
            Print saveToFile = new SaveToFile();
            Print printReport = new PrintReport();

            report.output(saveToFile);
            report.output(printReport);
    }
}
