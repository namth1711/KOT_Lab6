package fpoly.namth.lab6.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fpoly.namth.lab6.model.entities.Movie
import fpoly.namth.lab6.ui.components.MovieRow
import fpoly.namth.lab6.ui.components.MovieScreen
import fpoly.namth.lab6.utils.createTheaterSeating


@Preview
@Composable
fun Bai2(){
    MovieScreen(Movie.getSampleMovies())

}

@Composable
fun Bai1(){
    MovieRow(Movie.getSampleMovies())

}
@Composable
fun Bai3(){
    CinemaSeatBookingScreen(
        createTheaterSeating(
            totalRows = 12,
            totalSeatsPerRow = 9,
            aislePositionInRow = 4,
            aislePositionInColumn = 5
        ), totalSeatsPerRow = 9
    )
}