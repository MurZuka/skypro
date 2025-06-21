public class Author {
    private String firstName;
    private String surName;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return firstName + " " + surName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }

        Author a2 = (Author) other;
        return (firstName.equals(a2.firstName) && surName.equals(a2.surName));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, surName);
    }
}
