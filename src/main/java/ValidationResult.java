/**
 * Created by Dmitr_000 on 4/4/2015.
 */
public class ValidationResult {
    private boolean  isCorrect;
    private String message ="";

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
