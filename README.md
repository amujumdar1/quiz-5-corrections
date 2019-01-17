# Quiz 5 Corrections
## Question 1
Consider the following partially implemented class.


``` java
public class Quiz {

    private static int id = 1;
    private int questionCount;

    public Quiz(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getId() {
        return id;
    }

    public void incrementId() {
        id++;
    }

    public int getQuestionCount() {
        return questionCount;
    }
}
```
Now, consider the following usage of the aforementioned class.
```java
Quiz q1 = new Quiz(10);
Quiz q2 = new Quiz(15);
q2.incrementId();

System.out.println(q1.getId());
System.out.println(q2.getId());
System.out.println(q1.getQuestionCount());
System.out.println(q2.getQuestionCount());
```
What will be printed to the console? <br> <br>
The correct answer is:
```
2
2
10
15
```
This is the correct answer because the variable id is static, meaning that it changes for each method. When q2's id is incremented that also affects the value of q1, making them both 2. Also, the questioncounts for both variables are defined in the constructor as 10 and 15, respectively, which should be the very values that are printed to the console in that order. 
## Question 2
From a classification perspective, a setter method is a(n)...? <br><br>
The correct answer is a mutator because a mutator method is defined as a method used to control changes to a variable, also known as a setter method. The rest of the options do not refer to this specific definition.
