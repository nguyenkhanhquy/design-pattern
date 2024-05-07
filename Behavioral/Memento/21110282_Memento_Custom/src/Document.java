public class Document {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Tạo memento từ trạng thái hiện tại của tài liệu
    public DocumentMemento createMemento() {
        return new DocumentMemento(content);
    }

    // Khôi phục trạng thái từ memento
    public void restoreFromMemento(DocumentMemento memento) {
        content = memento.getContent();
    }

}
