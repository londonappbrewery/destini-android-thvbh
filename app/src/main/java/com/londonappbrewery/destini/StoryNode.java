package com.londonappbrewery.destini;

public class StoryNode {

    public int getStoryText() {
        return storyText;
    }

    public void setStoryText(int storyText) {
        this.storyText = storyText;
    }

    public int getButtonTopText() {
        return buttonTopText;
    }

    public void setButtonTopText(int buttonTopText) {
        this.buttonTopText = buttonTopText;
    }

    public int getButtonBottomText() {
        return buttonBottomText;
    }

    public void setButtonBottomText(int buttonBottomText) {
        this.buttonBottomText = buttonBottomText;
    }

    public int getButtonTopDestination() {
        return buttonTopDestination;
    }

    public void setButtonTopDestination(int buttonTopDestination) {
        this.buttonTopDestination = buttonTopDestination;
    }

    public int getButtonBottomDestination() {
        return buttonBottomDestination;
    }

    public void setButtonBottomDestination(int buttonBottomDestination) {
        this.buttonBottomDestination = buttonBottomDestination;
    }

    private int storyText;
    private int buttonTopText;
    private int buttonBottomText;
    private int buttonTopDestination;
    private int buttonBottomDestination;

    public StoryNode(int storyText, int buttonTopText, int buttonBottomText, int buttonTopDestination, int buttonBottomDestination) {
        this.storyText = storyText;
        this.buttonTopText = buttonTopText;
        this.buttonBottomText = buttonBottomText;
        this.buttonTopDestination = buttonTopDestination;
        this.buttonBottomDestination = buttonBottomDestination;
    }
}
