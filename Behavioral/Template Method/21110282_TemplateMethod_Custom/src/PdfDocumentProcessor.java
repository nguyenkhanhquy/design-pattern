class PdfDocumentProcessor extends DocumentProcessor {

    @Override
    void openDocument() {
        System.out.println("Mở tài liệu PDF.");
    }

    @Override
    void readDocument() {
        System.out.println("Đọc tài liệu PDF.");
    }

    @Override
    void modifyDocument() {
        System.out.println("Sửa đổi tài liệu PDF.");
    }

    @Override
    void saveDocument() {
        System.out.println("Lưu tài liệu PDF.");
    }

}
