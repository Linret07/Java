package lessons.lesson6.lesson6_2;

class Main {
    public static void main(String[] args) throws InterruptedException {
        CalculateReportJob calculateReportJob = new CalculateReportJob();
        SendReportJob sendReportJob = new SendReportJob(calculateReportJob);
        Thread calculateReportJobThread = new Thread(calculateReportJob);
        calculateReportJobThread.start();
        calculateReportJobThread.join();
        sendReportJob.start();
    }
}
