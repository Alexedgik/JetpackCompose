package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.Grey100


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .background(Grey100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.egor, "Егор", "testja;lsidfgakjhjkhncv:XOJIHf;kjshjkhfhnJS:LKjfh+"+
                                "j;adflkjg;alkj"+"hlkjfghalkjhgjdfaklkjghalk"+"jhlkjhagdkjhgjsdfklkjhgksd"),
                        ItemRowModel(R.drawable.sergey, "Сергей","testsd;kfh;KLSDfh:LKjhf;LKjflskjflksjdflkjsdflkjslkdjf"),
                        ItemRowModel(R.drawable.andrey, "Андрей", "test"),
                        ItemRowModel(R.drawable.dula, "Дуля", "test"),
                        ItemRowModel(R.drawable.egor, "Егор", "test"),
                        ItemRowModel(R.drawable.sergey, "Сергей", "test"),
                        ItemRowModel(R.drawable.andrey, "Андрей", "test"),
                        ItemRowModel(R.drawable.dula, "Дуля", "test")
                    )
                ){ index, item ->
                    MyRow(item = item)
                }

            }
        }
    }
}



