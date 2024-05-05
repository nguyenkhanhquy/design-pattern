public class Main {

    public static void main(String[] args) {
        // Khởi tạo một xử lý tài liệu Word
        DocumentProcessor wordProcessor = new WordDocumentProcessor();
        wordProcessor.processDocument(); // Xử lý tài liệu Word

        System.out.println();

        // Khởi tạo một xử lý tài liệu PDF
        DocumentProcessor pdfProcessor = new PdfDocumentProcessor();
        pdfProcessor.processDocument(); // Xử lý tài liệu PDF
    }

}