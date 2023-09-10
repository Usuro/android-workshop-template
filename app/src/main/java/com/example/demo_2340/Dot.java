package com.example.demo_2340;


import android.system.Os;

public class Dot {
    private float x, y;
    private int radius;
    private boolean isVisible;
    private static final long MAX_LIFETIME = 10000; // Time out after 10 seconds
    private long visibleStartTime;

    public Dot(float x, float y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isVisible = true;

        // TODO Record the time when the dot becomes visible
        visibleStartTime = System.currentTimeMillis(); // Found this in the documentation. Looks like it works, though I'm not sure if this is intended

    }

    public boolean isExpired() {
        // TODO Check if the dot has exceeded its max lifetime
        return System.currentTimeMillis() == (visibleStartTime + MAX_LIFETIME); // Hotfix to see what the game looks like when run.
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setInvisible() {
        isVisible = false;
    }
}
