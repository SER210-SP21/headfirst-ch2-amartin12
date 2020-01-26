/*Alexandra Martin
Professor Ruby
Ch2 HW
Due:28 Jan 2020
*/

package edu.quinnipiac.ser210.beeradviserapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();
    TextView brands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    //Method used when user clicks on the Button
    public void onClickFindBeer(View view) {
        //reference to TexteView
        brands = (TextView) findViewById(R.id.brands);
        //reference to Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Selects item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());


        //Link to Beer Expert
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for(String brand : brandList){
            brandsFormatted.append(brand).append('\n');
        }
        //Display Beer
        brands.setText(brandsFormatted);


    }
}
