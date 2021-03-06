package com.farhan.moviepocket.architecture

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.farhan.moviepocket.model.Data

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie")
    fun loadAllMovies(): LiveData<List<Data>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProduct(data: Data)

}