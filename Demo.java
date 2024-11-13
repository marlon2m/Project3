// Demo.java
public class Demo {
    public class Demo {
        PolicyHolder holder1 = new PolicyHolder("Alice", "Jones", 20, true, 65.0, 110.0);
        Policy policy1 = new Policy("3450", "States Farm", holder1);
        
        System.out.println(policy1); 
        System.out.println("Number of Policy objects created: "+Policy.getPolicyCount());
        }
  }