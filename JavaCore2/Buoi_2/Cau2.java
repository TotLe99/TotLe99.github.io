public class Cau2 {
    public static void main(String[] args) {
        String str1 = "Trung tam Techmaster day lap trinh";
        String str2 = "Trung tam Techmaster";

        // So sánh giá trị 2 chuỗi
        System.out.println(str1.equals(str2));

        // So sánh kích thước 2 chuỗi
        System.out.println(str1.compareTo(str2));

        // Kiểm tra chuỗi đầu tiên có chứa chuỗi thứ 2 không
        System.out.println(str1.contains(str2));
    }
}
