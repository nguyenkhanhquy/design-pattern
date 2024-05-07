public class Main {

    public static void main(String[] args) {
        // Tạo một tài liệu
        Document document = new Document();

        // Thêm các phiên bản vào tài liệu
        document.addVersion(new Version("Version 1", "2024-05-01"));
        document.addVersion(new Version("Version 2", "2024-05-02"));
        document.addVersion(new Version("Version 3", "2024-05-03"));

        // Tạo Iterator
        Iterator<Version> iterator = document.createIterator();

        // Duyệt qua các phiên bản và in ra thông tin của từng phiên bản
        while (iterator.hasNext()) {
            Version version = iterator.next();
            System.out.println(version);
        }
    }
    
}
