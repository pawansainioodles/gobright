package  com.ai.gobright

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.en.botsdk.ui.ChatFragment
import com.ai.gobright.R

class BotActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bot_test)
        val fragment = ChatFragment()
        supportFragmentManager.beginTransaction().replace(R.id.bot_container,fragment).addToBackStack(null).commit()
    }
}
