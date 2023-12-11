package zzTesting;

public class StringBuilderExample {
    public static String createStringWithoutStringBuilder(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += 'a';
        }
        return result;
    }
    public static String createStringWithStringBuilder(int n) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            resultBuilder.append('a');
        }
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        int n = 10000;

        // Tanpa StringBuilder
        long startTime = System.nanoTime();
        String resultWithoutStringBuilder = createStringWithoutStringBuilder(n);
        long endTime = System.nanoTime();
        long durationWithoutStringBuilder = endTime - startTime;

        System.out.println("String without StringBuilder: " + durationWithoutStringBuilder + " nanoseconds");

        // Menggunakan StringBuilder
        startTime = System.nanoTime();
        String resultWithStringBuilder = createStringWithStringBuilder(n);
        endTime = System.nanoTime();
        long durationWithStringBuilder = endTime - startTime;

        System.out.println("String with StringBuilder: " + durationWithStringBuilder + " nanoseconds");
    }

    // ... (Implementasi createStringWithoutStringBuilder dan createStringWithStringBuilder di atas)
}

