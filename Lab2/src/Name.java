public class Name {
    public String lastName;
    public String firstName;
    public String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }


    @Override
    public String toString() {
        String result = "";
        if (lastName != null && !lastName.isEmpty()) {
            result = result + lastName + " ";
        }
        if (firstName != null && !firstName.isEmpty()) {
            result = result + firstName + " ";
        }
        if (middleName != null && !middleName.isEmpty()) {
            result = result + middleName;
        }
        return result.trim();
    }
}
