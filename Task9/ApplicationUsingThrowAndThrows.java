package Task9;
// Custom Exception
class AgeInvalidException extends Exception {
    AgeInvalidException(String message) {
        super(message);
    }
}

// Class with method that uses 'throws'
class Registration {

    // Method throws exception if age < 18
    void registerUser(int age) throws AgeInvalidException {
        if (age < 18) {
            // Using 'throw' to throw the exception
            throw new AgeInvalidException("User must be 18 or older to register!");
        } else {
            System.out.println("Registration successful. Age: " + age);
        }
    }
}


public class ApplicationUsingThrowAndThrows {
    public static void main(String[] args) {
        Registration reg = new Registration();

        try {
            reg.registerUser(16);  // Invalid age
        } catch (AgeInvalidException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

        try {
            reg.registerUser(21);  // Valid age
        } catch (AgeInvalidException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}
