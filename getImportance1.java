package LeetCode;

import java.util.*;
//Map+队列
public class getImportance1 {
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map=new HashMap<>();
        for(Employee e:employees){
            map.put(e.id,e);
        }
        Queue<Employee> queue=new LinkedList<>();
        queue.offer(map.get(id));
        int sum=0;
        while(!queue.isEmpty()){
            Employee employee=queue.poll();
            sum+=employee.importance;
            for(int subId:employee.subordinates){
                queue.offer(map.get(subId));
            }
        }
        return sum;
    }
}
