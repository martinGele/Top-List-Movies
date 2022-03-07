package com.martin.favoritemovies.features.main

import androidx.recyclerview.widget.DiffUtil
import com.martin.favoritemovies.api.models.TopRatedMovies

class MoviesComparator : DiffUtil.ItemCallback<TopRatedMovies.Result>() {
    override fun areItemsTheSame(oldItem: TopRatedMovies.Result, newItem: TopRatedMovies.Result) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: TopRatedMovies.Result, newItem: TopRatedMovies.Result) =
        oldItem == newItem

}