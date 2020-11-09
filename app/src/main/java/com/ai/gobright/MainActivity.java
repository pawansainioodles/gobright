package com.ai.gobright;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.en.botsdk.Constants.LanguageAlignment;
import com.en.botsdk.ui.ChatBotConfig;


public class MainActivity extends AppCompatActivity {
    private String botName = "";
    private String botKey = "603836d5f5c647c8";
    private String botUserId = "user_id";
    private int botChatHistoryLimit = 10000;
    private Boolean isCallbackEnabled = true;
    private int REQUEST_CODE_CALLBACK = 1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChatBotConfig.getInstance().init(botKey, null, true, "default",
                this, botUserId,botChatHistoryLimit , isCallbackEnabled,
                LanguageAlignment.DEFAULT, null, null, 0);
        ChatBotConfig.getInstance().launchBot(REQUEST_CODE_CALLBACK);
        //Typeface.DEFAULT
//        ChatBotConfig.getInstance().init("7b2f8fe62c8d4176", "EngatiBot", true, "default",
//                this, "user_id", 0, true,
//                LanguageAlignment.DEFAULT, null, null, R.drawable.ic_launcher);
//        ChatBotConfig.getInstance().launchBot(1234);
//        ChatFragment fragment = new ChatFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.bot_container,fragment).commit();
//        startActivityForResult(new Intent(this, BotActivity.class), 1234);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 1234) {
//                if (data != null) {
//                    EngatiResult result = (EngatiResult) data.getSerializableExtra("RESULT_DATA");
//                    Toast.makeText(this, result.getExitUrl(), Toast.LENGTH_SHORT).show();
//                }
            }
        }
    }
}
