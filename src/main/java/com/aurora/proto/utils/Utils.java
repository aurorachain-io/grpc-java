package com.aurora.proto.utils;

import com.google.protobuf.ByteString;

import java.math.BigInteger;

public class Utils {
    private Utils() {
    }

    public static String byteStringToHex(ByteString byteString) {
        if (byteString == null || byteString.isEmpty()) {
            return "";
        }
        StringBuilder buffer = new StringBuilder("0x");
        byte[] bytes = byteString.toByteArray();
        for (int i = 0; i < bytes.length; i++) {
            int b = bytes[i] & 0xFF;
            String hex = Integer.toHexString(b);
            if (b < 0xF) {
                buffer.append("0" + hex);
            } else {
                buffer.append(hex);
            }
        }
        return buffer.toString();
    }

    public static BigInteger byteStringToBigInteger(ByteString byteString) {
        BigInteger sum = BigInteger.ZERO;
        if (byteString == null || byteString.isEmpty()) {
            return sum;
        }

        byte[] bytes = byteString.toByteArray();
        for (int i = 0; i < bytes.length; i++) {
            int b = bytes[i] & 0xFF;
            BigInteger temp = BigInteger.valueOf(b);
            temp = temp.shiftLeft(0x08 * (bytes.length - i - 1));
            sum = sum.add(temp);
        }
        return sum;
    }
}
