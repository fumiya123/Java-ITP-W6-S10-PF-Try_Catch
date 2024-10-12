public class Main {
    public static void main(String[] args) {
        try {
            // Blok kode yang mungkin menyebabkan exception
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // Akan menimbulkan ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Menangkap dan menangani exception
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
        }

        // Kode ini tetap dieksekusi meskipun ada exception
        System.out.println("Program berlanjut...");
    }
}
