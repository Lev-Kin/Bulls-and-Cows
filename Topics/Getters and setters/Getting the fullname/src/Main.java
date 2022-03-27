
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        final String empty = "";

        if (empty.equals(this.firstName) && empty.equals(this.lastName)) {
            System.out.println("Unknown");
        } else if (empty.equals(this.firstName)) {
            return this.lastName;
        } else if (empty.equals(this.lastName)) {
            return this.firstName;
        }

        return this.firstName + " " + this.lastName;
    }
}