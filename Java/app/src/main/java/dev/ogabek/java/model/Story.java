package dev.ogabek.java.model;

public class Story {

    private final int profile;
    private final int status;
    private final String fullName;

    public Story(int profile, int status, String fullName) {
        this.profile = profile;
        this.status = status;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getProfile() {
        return profile;
    }

    public int getStatus() {
        return status;
    }
}
