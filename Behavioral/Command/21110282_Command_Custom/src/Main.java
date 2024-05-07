public class Main {

    public static void main(String[] args) {
        // Tạo đối tượng Document
        Document document = new Document();

        // Tạo các commands
        Command openCommand = new OpenCommand(document);
        Command saveCommand = new SaveCommand(document);
        Command closeCommand = new CloseCommand(document);

        // Tạo đối tượng Menu và thêm các commands vào menu
        Menu menu = new Menu();
        menu.addCommand(openCommand);
        menu.addCommand(saveCommand);
        menu.addCommand(closeCommand);

        // Thực thi các commands từ menu
        menu.executeCommand(0); // Mở tài liệu
        menu.executeCommand(1); // Lưu tài liệu
        menu.executeCommand(2); // Đóng tài liệu
        menu.executeCommand(3); // Lệnh không hợp lệ
    }

}
