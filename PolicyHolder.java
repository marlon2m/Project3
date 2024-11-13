// PolicyHolder.java
public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private boolean smoker;
    private double height; // in inches
    private double weight; // in pounds
 }
 
 public String toString() {
     return " Policyholder's First Name: " + firstName +
            "\nPolicyholder's Last Name : " + lastName +
            "\nPolicyholder's Age: " + age +
            "\nPolicyholder's Smoking Status (Y/N): " + (smoker ? "smoker" : "non-smoker") +
            "\nPolicyholder's Height: " + height + " inches" +
            "\nPolicyholder's Weight: " + weight + " pounds";
}
