package ca.quickheaven.ocjp.practice.test.one;

// At which line type parameters/arguments can be replaced with a diamond(<>) ? None of the above
public class Question6<T, S> { /* 1  */ // Task<T, S>

    private T t;
    private S s;

    private Question6(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public static <U> /* 2 */
        Question6<U, U> createTask(U u) /* 3 */  {
            return new Question6<>(u, u);
    }


    public static void main(String[] args) {

        Question6<String, String> task = Question6 /* 4 */
                .<String>createTask(""); /* 5 */
        // unrelated code

    }
}
