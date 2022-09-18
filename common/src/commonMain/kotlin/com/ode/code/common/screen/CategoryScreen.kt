package com.ode.code.common.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ode.code.common.model.AppState
import com.ode.code.common.model.ScreenType

data class Category(
    val categoryName: String, val ticked: Boolean = false
)

@Composable
fun CategoryScreen() {
    MaterialTheme(
        colors = lightColors()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            val categorySelectedState = remember { mutableStateOf(true) }
            Box(modifier = Modifier.fillMaxWidth().align(Alignment.TopCenter)) {
                renderCategories(
                    mutableListOf(
                        Category("Category A"),
                        Category("Category B"),
                        Category("Category C"),
                        Category("Category D"),
                        Category("Category E"),
                        Category("Category F")

                    )
                )
                { categorySelectedState.value != categorySelectedState.value }
            }

            Button(
                onClick = { AppState.screenState(ScreenType.ProductScreen) },
                modifier = Modifier.align(Alignment.BottomCenter).padding(8.dp),
                enabled = categorySelectedState.value
            ) {
                Text("Continue")
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun materialCard(category: Category, categorySelectedState: () -> Unit) {
    Card(elevation = 10.dp,
        border = BorderStroke(
            1.dp, Color.Gray
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(8.dp).clickable { AppState.screenState(ScreenType.ProductScreen) }) {
        Text(
            textAlign = TextAlign.Center, text = category.categoryName, modifier = Modifier.padding(20.dp)
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun renderCategories(categories: MutableList<Category>, categorySelectedState: () -> Unit) {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(150.dp),
    ) {
        items(categories.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                materialCard(categories[it], categorySelectedState)
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalFoundationApi::class)
@Composable
fun previewCategories() {
    val categorySelectedState = mutableStateOf(false)
    renderCategories(
        mutableListOf(
            Category("Category A"),
            Category("Category B"),
            Category("Category C"),
            Category("Category D"),
            Category("Category E"),
            Category("Category F")
        )
    ) { categorySelectedState.value != categorySelectedState.value }
}