public abstract class DocumentProcessor {

    // Phương thức template cho quy trình xử lý tài liệu
    public final void processDocument() {
        openDocument(); // Mở tài liệu
        readDocument(); // Đọc tài liệu
        modifyDocument(); // Sửa đổi tài liệu
        saveDocument(); // Lưu tài liệu
    }

    // Phương thức được triển khai bởi các lớp con để mở tài liệu
    abstract void openDocument();

    // Phương thức được triển khai bởi các lớp con để đọc tài liệu
    abstract void readDocument();

    // Phương thức được triển khai bởi các lớp con để sửa đổi tài liệu
    abstract void modifyDocument();

    // Phương thức được triển khai bởi các lớp con để lưu tài liệu
    abstract void saveDocument();

}
