package serialize.serialex;

import lombok.ToString;

import java.io.Serializable;

// 1. Serializable 인터페이스 구현해야 직렬화 가능!
class User implements Serializable {
    private static final long serialVersionUID = 1L; // 버전 관리용 (권장)
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
