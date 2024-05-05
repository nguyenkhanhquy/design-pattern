public class DoorTest {

    public static void main(String[] args) {
        // Khởi tạo cửa ở trạng thái mặc định (ClosedState)
        Door door = new Door();

        door.click();
        door.complete();
        door.click();
        door.timeout();
        door.complete();
    }

}
