package exam;

import java.util.HashMap;
import java.util.Map;
public class MutableCustomKey {
    public MutableCustomKey(String name)
    {
        this.name=name;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) { // Name 변경을 허용함 -> 문제 !
        this.name = name;
    }
    @Override
    public int hashCode() {   // 커스텀 키에 대해 hashCode() 제공
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {   // 커스텀 키에 대해 equals() 제공
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MutableCustomKey other = (MutableCustomKey) obj;
        if (name == null) {
            if (other.name != null)
                return  false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public static void main(String[] args) {
        MutableCustomKey key = new MutableCustomKey("Shamik");
        Map<MutableCustomKey,String> map = new HashMap<MutableCustomKey,String>();
        map.put(key, "Shamik Mitra");
        MutableCustomKey refKey = new MutableCustomKey("Shamik");
        String val = map.get(refKey);
        System.out.println("Value Found " + val);
        key.setName("Bubun");
        // 속성이 변경되면 응용 프로그램에서 해당 항목을 찾을 수 없지만 맵에는 참조가 있음
        // -> 메모리 누수
        String val1 = map.get(refKey);
        System.out.println("Due to MutableKey value not found " + val1);
    }
}