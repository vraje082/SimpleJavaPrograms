package crackingCodingInterview.oops.Excercise2;

/**
 * Created by vasanthan on 2017-06-26.
 */
public class Employee {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public EmployeeLevels getLevel() {
        return level;
    }

    public void setLevel(EmployeeLevels level) {
        this.level = level;
    }

    private EmployeeLevels level;

}
