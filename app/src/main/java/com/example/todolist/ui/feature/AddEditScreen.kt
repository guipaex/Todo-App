import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.ui.theme.ToDoListTheme

@Composable
fun AddEditScreen(id: Long?) {
    AddEditContent()
}

@Composable
fun AddEditContent(modifier: Modifier = Modifier) {
    Scaffold (
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Check, contentDescription = "Salvar")
            }
        }
    ) { paddingValues ->
        Column (modifier = Modifier
            .consumeWindowInsets(paddingValues)
            .padding(16.dp)
        ){
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = { },
                placeholder =  {
                    Text(text = "Nome da Tarefa")
                }
            )
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = { },
                placeholder =  {
                    Text(text = "Descrição (opcional)")
                }
            )
        }

    }
}

@Preview
@Composable
private fun AddEditContentPreview() {
    ToDoListTheme {
        AddEditContent()
    }
}