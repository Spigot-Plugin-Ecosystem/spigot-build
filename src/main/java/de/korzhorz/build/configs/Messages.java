package de.korzhorz.build.configs;

public class Messages {
    public String get(String path) {
        return ConfigFiles.messages.getString(path);
    }
}
