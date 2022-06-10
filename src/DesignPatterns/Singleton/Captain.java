package DesignPatterns.Singleton;

final class Captain {
    private static Captain captain;

    private Captain() {
    }

    public static synchronized Captain getCaptain() {
        if (captain == null) {
            captain = new Captain();
        }
        return captain;
    }
}
