package com.abhi.basics;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String s = "meghana meghana meghana is is a gud girl";
        String duplicate = "";
        String[] array = s.split(" ");
        String k[] = duplicateValue(array);
        for (String value : k) {
            if (value != null) {
                duplicate = duplicate.concat(value + " ");
            }
        }
        System.out.println(duplicate);
    }

    static String[] duplicateValue(String[] z) {
        for (int i = 0; i < z.length; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (z[i] != null && z[j] != null) {
                    if (z[i].equalsIgnoreCase(z[j])) {
                        z[j] = null;
                    }
                }
            }
        }
        return z;
    }
}
