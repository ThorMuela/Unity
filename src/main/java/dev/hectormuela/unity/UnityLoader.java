package dev.hectormuela.unity;

public class UnityLoader {
    public static void initialize() {
        System.out.println("Unity Loader iniciado.");
        ModCompatibilityManager.loadCompatibleMods();
    }
}
