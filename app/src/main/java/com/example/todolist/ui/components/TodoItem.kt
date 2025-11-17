package com.example.todolist.ui.components

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.todolist.domain.Todo
import com.example.todolist.domain.todo1
import com.example.todolist.domain.todo2
import com.example.todolist.ui.theme.ToDoListTheme


@Composable
fun TodoItem(
    todo: Todo,
    onCompletedChange: (Boolean) -> Unit,
    onItemClick: () -> Unit,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .height(80.dp)
            .dropShadow(
                shape = MaterialTheme.shapes.medium,
                shadow = Shadow(
                    radius = 16.dp,
                    spread = 0.dp,
                    color = Color(0x40000000),
                    offset = DpOffset(x = 4.dp, 4.dp)
            ),
                ),
        shape = MaterialTheme.shapes.medium,
        shadowElevation = 2.dp,
        border = BorderStroke(
            width = 0.5.dp,
            color = Color.LightGray
        ),
        onClick = onItemClick
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = todo.isCompleted,
                onCheckedChange = onCompletedChange,
            )
            Spacer( modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = todo.title,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer( modifier = Modifier.height(2.dp))

                todo.description?.let{
                    Text(
                        text = todo.description,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            Spacer( modifier = Modifier.width(8.dp))

            IconButton(
                onClick = onDeleteClick) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete"
                )
        }
        }
    }
}


@Preview
@Composable
private fun TodoItemPreview() {
    ToDoListTheme {
        TodoItem(
            todo = todo1,
            onCompletedChange = {},
            onItemClick = {},
            onDeleteClick = {}
        )
    }
}

@Preview
@Composable
private fun TodoItemCompletedPreview() {
    ToDoListTheme {
        TodoItem(
            todo = todo2,
            onCompletedChange = {},
            onItemClick = {},
            onDeleteClick = {})
    }
}
