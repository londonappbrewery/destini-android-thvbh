package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex;

    final StoryNode[] storyNodes = new StoryNode[] {
            new StoryNode(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 2, 1),
            new StoryNode(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 2, 3),
            new StoryNode(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 5, 4),
            new StoryNode(R.string.T4_End, 0, 0, 0, 0),
            new StoryNode(R.string.T5_End, 0, 0, 0, 0),
            new StoryNode(R.string.T6_End, 0, 0, 0, 0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);
        mStoryIndex = 0;

        mStoryTextView.setText(storyNodes[mStoryIndex].getStoryText());
        mButtonTop.setText(storyNodes[mStoryIndex].getButtonTopText());
        mButtonBottom.setText(storyNodes[mStoryIndex].getButtonBottomText());
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStoryNode(storyNodes[mStoryIndex].getButtonTopDestination());
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStoryNode(storyNodes[mStoryIndex].getButtonBottomDestination());
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    }

    private void updateStoryNode (int destination) {
        mStoryIndex = destination;
        mStoryTextView.setText(storyNodes[mStoryIndex].getStoryText());
        if(storyNodes[mStoryIndex].getButtonTopText() != 0) {
            mButtonTop.setText(storyNodes[mStoryIndex].getButtonTopText());
        } else {
            mButtonTop.setVisibility(View.INVISIBLE);
        }
        if(storyNodes[mStoryIndex].getButtonBottomText() != 0) {
            mButtonBottom.setText(storyNodes[mStoryIndex].getButtonBottomText());
        } else {
            mButtonBottom.setVisibility(View.INVISIBLE);
        }

    }
}
