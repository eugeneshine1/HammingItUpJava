package main.zipcode;

public class Hamming {
    private String s;
    private String s1;
    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if (s.length()!=s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int hamming = 0;
        for (int x = 0; x<s.length();x++) {
            //NOT s.substring(x) bc IDK
            if (s.charAt(x)!=s1.charAt(x)) {
                hamming++;
            }
        }
        return hamming;
    }
}
