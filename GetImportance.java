package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class GetImportance {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return getImportanceHelper(map, id);
    }

    private int getImportanceHelper(Map<Integer, Employee> map, int id) {
        Employee employee = map.get(id);
        int sum = employee.importance;
        for (int i = 0; i < employee.subordinates.size(); i++) {
            int subId = employee.subordinates.get(i);
            sum += getImportanceHelper(map, subId);
        }
        return sum;
    }
}
