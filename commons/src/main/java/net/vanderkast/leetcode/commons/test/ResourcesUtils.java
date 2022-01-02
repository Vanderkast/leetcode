package net.vanderkast.leetcode.commons.test;

import java.io.IOException;
import java.io.InputStream;

public class ResourcesUtils {
    private ResourcesUtils(){
    }

    public static <T> T readFromResource(Class<T> clazz, String relativeFilePath) throws IOException {
        var content = readResourceFileContent(relativeFilePath);
        return Parser
                .getInstance(clazz)
                .parse(content);
    }

    private static String readResourceFileContent(String fileName) throws IOException {
        ClassLoader classLoader = ResourcesUtils.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            byte[] content = new byte[inputStream.available()];
            inputStream.read(content);
            return new String(content);
        }

    }

    @FunctionalInterface
    private interface Parser<T> {
        static <T> Parser<T> getInstance(Class<T> clazz) {
            if(clazz == int[].class)
                return (Parser<T>) arrayParser;
            throw new UnsupportedOperationException("Passed type is nopt supported");
        }
        T parse(String s);
    }

    private static final Parser<int[]> arrayParser = string -> {
        var splits = string.split(",");
        int[] result = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            result[i] = Integer.parseInt(splits[i].strip());
        }
        return result;
    };
}
