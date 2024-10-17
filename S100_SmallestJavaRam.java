// jav -Xmx15m 

interface S100_SmallestJavaRam {

    static long asMb(long bytes) {
        return bytes / 1024 /1024;
    }

    static void main(String... args) {
        var runtime = Runtime.getRuntime();
        var total = asMb(runtime.totalMemory());
        var free = asMb(runtime.freeMemory());
        var usedMemory = total - free;

        System.out.println("usage: %dMB".formatted(usedMemory));
        System.out.println("total: %dMB".formatted(total));
        System.out.println("free: %dMB".formatted(free));
    }

}
