package lessons.lesson6.lesson6_2;

public class CalculateReportJob implements Runnable  {
    private  String result;

    public String getResult() {
        return result;
    }

    @Override
    public void run() {
        System.out.println("Calculating report...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.result = "Here is some reports for my clients: {1, 5, 3}";
        System.out.println("Report is ready");
    }
}
