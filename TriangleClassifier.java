public class TriangleClassifier {
    public static String triangleClassifier(int edge1, int edge2, int edge3){
        if (edge1 > 0 && edge2 > 0 && edge3 > 0){
            if (edge1+edge2 <= edge3 || edge1+edge3 <= edge2 || edge2+edge3 <= edge1){
                return "Khong phai tam giac";
            }else if (edge1 == edge2 && edge2 == edge3){
                return "Tam giac deu";
            } else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3){
                return "Tam giac can";
            }else {
                return "Tam giac thuong";
            }
        }else {
            return "Khong phai tam giac";
        }
    }
}
