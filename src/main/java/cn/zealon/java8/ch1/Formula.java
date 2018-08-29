package cn.zealon.java8.ch1;


/**
 * @auther: Zealon
 * @Date: 2018-08-29 10:02
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    default String sayHi(String words){
        return "your say: "+words;
    }

    public static void main(String[] args){
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return 0;
            }
        };

        System.out.println(formula.sqrt(10));
        System.out.println(formula.sayHi("秋天."));
    }
}
