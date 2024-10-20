package prm392.project.api;

import java.util.List;

import prm392.project.model.Food;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodService {

    @GET("food")
    Call<List<Food>> getFoodList(
            @Query("pageIndex") int pageIndex,
            @Query("pageSize") int pageSize,
            @Query("keyword") String keyword
    );
}
