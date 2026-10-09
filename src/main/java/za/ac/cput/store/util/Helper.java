package za.ac.cput.store.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}