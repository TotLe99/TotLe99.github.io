public class Main {
    public static void main(String[] args) {

        Book[] listBook = new Book[10];

        listBook[0] = new Book(1, "Ngon tinh", "Mai mai la bao xa", 2017);
        listBook[1] = new Book(2, "Ngon tinh", "That tich khong mua", 2018);
        listBook[2] = new Book(3, "Ngon tinh", "Yeu tu cai nhin dau tien", 2018);
        listBook[3] = new Book(4, "Doi song", "Dac nhan tam", 2017);
        listBook[4] = new Book(5, "Doi song", "Tuoi tre dang gia bao nhieu?", 2018);
        listBook[5] = new Book(6, "Doi song", "Nha gia kim", 2017);
        listBook[6] = new Book(7, "Truyen tranh", "Deraemon", 2017);
        listBook[7] = new Book(8, "Truyen tranh", "Conan", 2017);
        listBook[8] = new Book(9, "Truyen tranh", "Pokemon", 2018);
        listBook[9] = new Book(10, "Truyen tranh", "BlaBlom", 2017);

        for (Book book : listBook) {
            System.out.println(book);
        }
    }

}
