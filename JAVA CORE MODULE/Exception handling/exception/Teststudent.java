package exception;

public class Teststudent {

    public static void main(String[] args) {

        AdmissionForm af = new AdmissionForm("Amol", 20, 50,3000);

        try {
            af.ValidateForm();
        } 
        catch (EmptyNameException ene) {
            System.out.println(ene);
        }
        catch (UnderageException ua) {     // fixed spelling
            System.out.println(ua);
        }
        catch (InvalidpercentageException ip) {
            System.out.println(ip);
        }
        catch (NotFitForAdmissionException nf) {
            System.out.println(nf);
        }
        catch (FeesNotPaidException fp) {
            System.out.println(fp);
        }
        catch (InsufficientFeesException is) {
            System.out.println(is);
        }
    }
}
