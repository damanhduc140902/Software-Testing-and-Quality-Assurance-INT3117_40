
public class StudentAssessment {
    public String undervest(float gpa, float drl) {
        String res;
        if (gpa > 4.0 || gpa < 0.0 || drl > 100.0 || drl < 0.0) {
            res = "Invalid input";
        } else {
            if (drl >= 90 && drl <= 100) {
                if (gpa >= 3.6 && gpa <= 4.0) {
                    res = "Xuất sắc";
                } else if (gpa >= 3.2 && gpa <= 3.59) {
                    res = "Giỏi";
                } else if (gpa >= 2.5 && gpa <=3.19) {
                    res = "Khá";
                } else if (gpa >= 2.0 && gpa <= 2.49) {
                    res = "Trung bình";
                } else if (gpa >= 1.0 && gpa <= 1.99) {
                    res = "Yếu";
                } else {
                    res = "Kém";
                }
            } else if (drl >= 80 && drl <=89) {
                if (gpa >=3.2 && gpa <=4.0) {
                    res = "Giỏi";
                } else if (gpa >= 2.5 && gpa <= 3.19) {
                    res = "Khá";
                } else if (gpa >= 2.0 && gpa <= 2.49) {
                    res = "Trung bình";
                } else if (gpa >=1.0 && gpa <= 1.99) {
                    res = "Yếu";
                } else {
                    res = "Kém";
                }
            } else if (drl >= 65 && drl <=79) {
                if (gpa >= 2.5 && gpa <= 4.0) {
                    res = "Khá";
                } else if (gpa >= 2.0 && gpa <= 2.49) {
                    res = "Trung bình";
                } else if (gpa >= 1.0 && gpa <= 1.99) {
                    res = "Yếu";
                } else {
                    res = "Kém";
                }
            } else if (drl >= 50 && drl <=64) {
                if (gpa >=2.0 && gpa <=4.0) {
                    res = "Trung bình";
                } else if (gpa >= 1.0 && gpa <= 1.99) {
                    res = "Yếu";
                } else {
                    res = "Kém";
                }
            } else if (drl >=35 && drl <= 49) {
                if (gpa >= 0 && gpa <= 0.99) {
                    res = "Kém";
                } else {
                    res = "Yếu";
                }
            } else {
                res = "Kém";
            }
        }
        return res;
    }

}
