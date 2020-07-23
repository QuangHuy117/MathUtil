/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static huy.util.MathUtil.computerFactorial;

/**
 *
 * @author Admin
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("5! = " + computerFactorial(5));

        //khi ta viết code xong, ta/dev phải test xem hàm/class/app chạy có 
        //đúng ko, việc này gọi là UnitTest, test mức hàm, mức class, mức đơn vị
        //test = cách đưa data vào hàm, class, chạy hàm, xem kết quả trả về
        //(actual value) rồi ta so kết quả trả về có đúng như ta đã mong 
        //đợi/tính toán trước đó, mong đợi: expected value
        //nếu actual = expected hàm chạy đúng/xử lý đúng như mong đợi
        //nếu ko bằng, hàm sai rồi, hoặc ta mong đợi sai
        //trong main() ta sout() kết quả actual so sánh với mong đợi expected
        //việc này gọi là kiểm thử bằng mắt, tự dùng mắt so sánh và luận kết quả 
        
        
        //expected: 1, tao hy vọng hàm chạy ói về con số 1
        //nếu khi chạy ko in ra 1 mà in ra 10 (ví dụ), 10 đc gọi là actual
        System.out.println("1! = " + computerFactorial(1));

        //expected: 1, hy vọng hàm tính 0! sẽ là 1, thực tế (actual) phải chạy đã
        System.out.println("0! = " + computerFactorial(0));

        //expected: 2
        System.out.println("2! = " + computerFactorial(2));
        
        //expected: 6
        System.out.println("3! = " + computerFactorial(3));
        
        //expected: chửi cà chớn nếu đưa vào cà chớn
        System.out.println("-5! = " + computerFactorial(-5));

    }

    //cách test = mắt có rủi ro nhỏ: tự so sánh data, luận, nhiều kết quả quá
    //dễ bị rối mắt và sai sót
    //trong giang hồ người ta đọ ra 1 kĩ thuật để test app/hàm chạy có đúng ko
    //bằng cách: gọi hàm với data đưa vào, lấy kết quả actual tự so sánh luôn với
    //expected, nếu đúng, khớp, bằng, in ra màu xanh
    //              sai,  lệch, ko bằng, in ra màu đỏ
    //và quan trọng hơn
    //nếu gọi nhiều hàm, gọi nhiều lần như đoạn code trên thì
    //XANH: TẤT CẢ PHẢI XANH
    //ĐỎ: 1 TRONG ĐÁM BỊ ĐỎ, COI NHƯ CẢ ĐÁM ĐỎ
    //màu xanh: khớp giữa expected và actual, do đó nếu có 1 cái ko khớp
    //màu đỏ: chứng minh 1 điều hàm lúc đúng lúc sai -> ko tốt
    //để làm đc điều này ta cần 1 đồ chơi/thư viện phụ trợ
    //để nó tự so sánh giùm expected vs actual, in ra màu sắc
    //thư viện này là: JUnit, TestNG (JAVA)
    //                 xUnit, NUnit, MSUnit (C#)
    //                 PHPUnit
    //                 CPPUnit
    //                  ...
    //.jar, .dll, ...
}
