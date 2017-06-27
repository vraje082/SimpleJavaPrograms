package crackingCodingInterview.oops.Excercise2;

/**
 * Imagine you have a call center with three levels of employees: respondent, manager,
 * and director. An incoming telephone call must be first allocated to a respondent
 * who is free. If the respondent can't handle the call, he or she must escalate the call
 * to a manager. If the manager is not free or notable to handle it, then the call should
 * be escalated to a director. Design the classes and data structures for this problem.
 * Implement a method dispatchCaL L () which assigns a call to the first available
 * employee.
 * <p>
 * 1) Initialize all the value
 * 2) Dispatch the call to first available employee
 */
public class CallCenter {

    public CallCenter() {
        int NumberOfRespondent = 10;
        int manager = 5;
        int director = 2;

        EmployeeLevels[] array = new EmployeeLevels[3];
        array[0] = EmployeeLevels.RESPONDENT;
        array[1] = EmployeeLevels.MANAGER;
        array[2] = EmployeeLevels.DIRECTOR;
    }

    public void getHandlerForCall(Call call) {

    }

    public void dispatchCall() {
    }
}
