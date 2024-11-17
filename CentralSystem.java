public class CentralSystem {
    public static void main(String[] args) {
        HelpDesk helpDesk = HelpDesk.getInstance();

        helpDesk.serveNextCustomer("Help Desk 1");
        helpDesk.serveNextCustomer("Help Desk 2");
        helpDesk.serveNextCustomer("Help Desk 3");
        helpDesk.serveNextCustomer("Help Desk 1");
        helpDesk.serveNextCustomer("Help Desk 2");
        helpDesk.serveNextCustomer("Help Desk 3");

        helpDesk.currentQueueNumber();

        helpDesk.resetQueueNumber(0);

        helpDesk.serveNextCustomer("Help Desk 1");
        helpDesk.serveNextCustomer("Help Desk 2");
        helpDesk.serveNextCustomer("Help Desk 3");
    }
}