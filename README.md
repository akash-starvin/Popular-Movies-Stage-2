# Popular Movies - Stage 2

## Overview
This project is apart of the Udacity Android Developer Nanodegree. In this project, we were prompted to build an app to allow users to discover the most popular movies playing. This app improves the functionality of the app built in Stage 1.

### MainActivity
1. Users are able to view list of movies.

![Screenshot](https://github.com/akash-starvin/PopularMovies/blob/master/Screenshots/Screenshot_main_list.jpg)

2. Movies can also be sorted by Most popular, Top Rated and Favorite.

![Screenshot](https://github.com/akash-starvin/PopularMovies/blob/master/Screenshots/Screenshot_sort.jpg)

### DetailedActivity
1. Users are able to view details of a selected movie.
2. Play trailers (in the youtube app or a web browser).
3. Read reviews if available.
4. Mark a movie as a favorite in here, by tapping the "Favorite" button. This is for a local movies collection stored on the phone.
5. This application utilizes the Room persistence library with LiveData for the "Favorited" movies.

![Screenshot](https://github.com/akash-starvin/PopularMovies/blob/master/Screenshots/Screenshot_deatil.jpg)

### Running the app
This app utilizes the Movie Database API. To run this app, you must obtain a free API key from the MovieDB website and add this following line of code to your MainActivity and DetailedActivity files:
API_KEY = "";
