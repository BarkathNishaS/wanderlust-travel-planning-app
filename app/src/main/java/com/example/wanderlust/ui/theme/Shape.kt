package com.example.wanderlust.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val SMALL_CORNER_RADIUS = 4.dp
val MEDIUM_CORNER_RADIUS = 8.dp

val WanderlustShapes = Shapes(
    small = RoundedCornerShape(SMALL_CORNER_RADIUS),
    medium = RoundedCornerShape(MEDIUM_CORNER_RADIUS),
    large = RoundedCornerShape(0.dp) // Represents a rectangle
)