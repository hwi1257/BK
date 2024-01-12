package Class;

class MyClass {
    // 필드(멤버 변수)
    int myField;

    // 메서드
    void myMethod() {
        System.out.println("Hello from myMethod!");
    }
}
public class Chap_1 {
    public static void main(String[] args) {
        // MyClass 클래스를 기반으로 객체 생성
        MyClass myObject = new MyClass();

        // 객체의 필드에 값 할당
        myObject.myField = 42;

        // 객체의 메서드 호출
        myObject.myMethod();

        // 객체 정보 출력
        System.out.println("myField: " + myObject.myField);
    }

}