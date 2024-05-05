public class ChainDemo {

    public static void main(String[] args) {
        // Tạo các handler
        Handler technicalSupportHandler = new TechnicalSupportHandler();
        Handler featureRequestHandler = new FeatureRequestHandler();
        Handler maintenanceRequestHandler = new MaintenanceRequestHandler();

        // Thiết lập chuỗi xử lý
        technicalSupportHandler.setNext(featureRequestHandler);
        featureRequestHandler.setNext(maintenanceRequestHandler);

        // Tạo các yêu cầu
        Request technicalRequest = new Request(RequestType.TECHNICAL, "Fix a bug");
        Request featureRequest = new Request(RequestType.FEATURE, "Add a new feature");
        Request maintenanceRequest = new Request(RequestType.MAINTENANCE, "Perform system maintenance");

        // Xử lý yêu cầu
        technicalSupportHandler.handleRequest(technicalRequest);
        technicalSupportHandler.handleRequest(featureRequest);
        technicalSupportHandler.handleRequest(maintenanceRequest);
    }

}
