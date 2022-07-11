package liucheuski.siarhei.servlets.util;

import lombok.SneakyThrows;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class HashPassword {

    @SneakyThrows
    public static byte[] getHash(String password) {
        return MessageDigest.getInstance("SHA-256").digest(password.getBytes(StandardCharsets.UTF_8));
    }
}
