/**
 * @author WangLe
 * @date 2019/7/3 9:17
 * @description
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("hahahha");
    }

    static class A {
        private String name;
        private String code;

        public A(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public A() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
