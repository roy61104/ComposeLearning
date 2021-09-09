package com.roy.composelearning

import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.roy.composelearning.bean.Message
import com.roy.composelearning.ui.theme.ComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MessageCard(Message("Android", "JetPack"))
            }
        }
    }

    @Composable
    fun MessageCard(content: Message) {
        Row {
            Image(
                painter = painterResource(R.mipmap.ic_launcher_round),
                contentDescription = null,
                modifier = Modifier.size(60.dp).clip(shape = CircleShape)
            )
            Spacer(modifier = Modifier.size(10.dp))
            Column {
                Spacer(modifier = Modifier.size(5.dp))
                Text("Hello ${content.author}!",fontSize = 15.sp)
                Spacer(modifier = Modifier.size(10.dp))
                Text("Hello ${content.body}!")
                Spacer(modifier = Modifier.size(5.dp))
            }

        }


    }

    @Preview(uiMode = UI_MODE_NIGHT_MASK)
    @Composable
    fun PreviewMessageCard() {
        MaterialTheme {
            MessageCard(Message("Jetpack", "Compose"))
        }

    }
}