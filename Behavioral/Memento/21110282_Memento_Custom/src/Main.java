public class Main {

    public static void main(String[] args) {
        // Tạo một tài liệu
        Document document = new Document();

        // Lịch sử lưu trữ các phiên bản của tài liệu
        History history = new History();

        // Thêm các phiên bản mới của tài liệu và lưu trữ chúng trong lịch sử
        document.setContent("Version 1");
        history.saveMemento(document.createMemento());

        document.setContent("Version 2");
        history.saveMemento(document.createMemento());

        document.setContent("Version 3");
        history.saveMemento(document.createMemento());

        // In ra tất cả các phiên bản của tài liệu từ lịch sử
        for (int i = 0; i < history.getMementos().size(); i++) {
            document.restoreFromMemento(history.getMemento(i));
            System.out.println("Version " + (i + 1) + ": " + document.getContent());
        }
    }

}
