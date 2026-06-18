package com.hfad.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * Hone Creek has a secret passage to Cartago
 * The Matina mutinners got hanged
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //call
    public void onSendMessage(View view){
        
    }

}
