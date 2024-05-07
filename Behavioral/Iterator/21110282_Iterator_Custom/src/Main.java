public class Main {

    public static void main(String[] args) {
        // Tạo một tài liệu
        File file = new File();

        // Thêm các phiên bản vào tài liệu
        file.addVersion(new Version("Version 1", "2024-05-01"));
        file.addVersion(new Version("Version 2", "2024-05-04"));
        file.addVersion(new Version("Version 3", "2024-05-07"));

        // Tạo Iterator
        Iterator<Version> iterator = file.createIterator();

        // Duyệt qua các phiên bản và in ra thông tin của từng phiên bản
        while (iterator.hasNext()) {
            Version version = iterator.next();
            System.out.println(version);
        }
    }

}
