public class TriangleClassifier {
    public static String triangle(int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "tam giac deu";
            }else if (a == b || a == c || b == c) {
                return "tam giac can";
            }
            return "tam giac thuong";
        }
        return "khong phai tam giac";
    }
}
