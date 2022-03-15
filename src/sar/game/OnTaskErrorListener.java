package sar.game;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
