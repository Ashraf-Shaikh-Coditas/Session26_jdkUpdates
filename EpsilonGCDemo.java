package Week6.Session26_jdk10;

public class EpsilonGCDemo {
    static final int MB = 1024 * 1024;
    static final int COUNT = 1024 * 10;

    public static void main(String[] args) {
        System.out.println("Starting ");

        for (int i = 0; i < COUNT; i++) {
            byte[] array = new byte[MB];
        }

        System.out.println("Terminating");
    }
}

/*

[0.005s][warning][gc] Consider setting -Xms equal to -Xmx to avoid resizing hiccups
[0.005s][warning][gc] Consider enabling -XX:+AlwaysPreTouch to avoid memory commit hiccups
Starting
Terminating due to java.lang.OutOfMemoryError: Java heap space


* */