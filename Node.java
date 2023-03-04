package basic.dev;
// khởi tạo dữ liệu
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// khởi tạo danh sách
class LinkedList {
    Node first;

    public LinkedList() {
        this.first = null;
    }
//khởi tạo biến chèn
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }
// nhập dữ liệu va hiển thị,(Curent : hiện hành)
    public void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
// khởi tạo dữ liệu tìm kiếm                                                                                                                                           
    public boolean search(int x) {
        Node current = first;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
// khởi tạo dữ liệu xóa
    public void delete(int x) {
        if (first == null) {
            return;
        }
        if (first.data == x) {
            first = first.next;
            return;
        }
        Node prev = first;
        Node current = first.next;
        while (current != null) {
            if (current.data == x) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
