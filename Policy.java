// Policy.java
public class Policy {
    private static int policyCount = 0;
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    
    public Policy(StringNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++;
 }
 
 public static int getPolicyCount() {
     return policyCount;
     }
 }
 
 // Policy.java (secure access to PolicyHolder)
 public PolicyHolder getPolicyHolder() {
      return new PolicyHolder
}
