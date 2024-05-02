package a14visitorpattern;

public class Client {
    public static void main(String[] args) {

        BusinessReport businessReport = new BusinessReport();
        businessReport.showReport(new CEOVisitor());//报表给CEO看，他只关心kpi
        businessReport.showReport(new CTOVisitor());//报表给CTO看，他只关心产出
    }
}
