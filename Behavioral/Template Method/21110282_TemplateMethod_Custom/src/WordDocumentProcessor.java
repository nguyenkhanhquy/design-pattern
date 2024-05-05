public class WordDocumentProcessor extends DocumentProcessor {

    @Override
    void openDocument() {
        System.out.println("Mở tài liệu Word.");
    }

    @Override
    void readDocument() {
        System.out.println("Đọc tài liệu Word.");
    }

    @Override
    void modifyDocument() {
        System.out.println("Sửa đổi tài liệu Word.");
    }

    @Override
    void saveDocument() {
        System.out.println("Lưu tài liệu Word.");
    }

}
