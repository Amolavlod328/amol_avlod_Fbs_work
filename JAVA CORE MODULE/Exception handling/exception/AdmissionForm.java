package exception;

public class AdmissionForm {

    String StName;
    int Age;
    double percentage;
    double courcefees=50000;
    double feespaid;

    public AdmissionForm(String stName, int age, double percentage,  double feespaid) {
        StName = stName;
        Age = age;
        this.percentage = percentage;
       // this.courcefees = courcefees;
        this.feespaid = feespaid;
    }

    void ValidateForm() throws EmptyNameException, UnderageException, InvalidpercentageException, NotFitForAdmissionException, FeesNotPaidException, InsufficientFeesException {

        // Name check
        if (StName == null || StName.trim().isEmpty()) {
            throw new EmptyNameException();
        }

        // Age check
        if (Age < 17) {
            throw new UnderageException();
        }

        // Percentage check
        if (percentage < 0 || percentage > 100) {
            throw new InvalidpercentageException();
        }

        // Passing marks
        if (percentage < 35) {
            throw new NotFitForAdmissionException();
        }

        // Fees check
        if (feespaid == 0) {
            throw new FeesNotPaidException();
        }

        if (feespaid < 0.30 * courcefees) {
            throw new InsufficientFeesException();
        }

        System.out.println("Admission Successful!");
    }
}
