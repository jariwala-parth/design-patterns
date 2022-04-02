package builder;

public class StudentWithoutBuilder {
    String name;
    int age;
    String addr;
    double psp;
    // and many more attributes

    // Getter and Setter
}

// Issues:
// For Student: - immutable objects -> immutable (an instance whose values can't be changed once assigned)

// ISSUE 1:
// Class with multiple attributes.

// ISSUE 2:
// Some attributes are mandatory. - HOW TO VALIDATE?


// ISSUE 3:
// Object should be immutable.
// SETTER method should not update attribute (by user after initialization)

