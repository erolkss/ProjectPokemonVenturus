package br.com.erolkss.projectpokemonventurus.data.api

import retrofit2.http.GET

interface ApiService {
    @GET("pokemon?limit=100")
    suspend fun getPokemonList(): PokemonResponse

}