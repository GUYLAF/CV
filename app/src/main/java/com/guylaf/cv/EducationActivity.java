package com.guylaf.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteducation);

        final List<Education> listeducation = new ArrayList<>();

        listeducation.add(new Education("Master MEF « Métiers de l’enseignement et de la formation »        (IUFM Montpellier 2012)"));
        listeducation.add(new Education("C2I2E « Certificat informatique et internet de l'enseignement supérieur de niveau 2 enseignant»  (IUFM Montpellier 2012) "));
        listeducation.add(new Education("AMT « Aide moniteur tennis » (FFT Ligue du Languedoc 2012)"));
        listeducation.add(new Education("Diplôme d’Etude Supérieure Technique « Informatique », BAC + 4  (Conservatoire National des Arts et Métiers Montpellier 1998)"));
        listeducation.add(new Education("Certificat « Cadre Informatique CIM » (Chambre de Commerce et d’Industrie de Nîmes 1993) "));
        listeducation.add(new Education("Diplôme Universitaire Post DUT BAC + 3  « Conception et Ingénierie de l’Informatique » (Université Sciences et Techniques Montpellier II 1992)"));
        listeducation.add(new Education("Diplôme Universitaire de Technologie « Informatique » BAC + 2 (Institut Universitaire de Technologie Montpellier 1984)"));
        listeducation.add(new Education("Baccalauréat Série D (Lycée Mas de Tesse Montpellier 1979)"));

        final ListView listView1 = (ListView) findViewById(R.id.listeducation);
        final AdapterEducation adaptereduc = new AdapterEducation(this);
        listView1.setAdapter((ListAdapter) adaptereduc);
        adaptereduc.setList(listeducation);
        adaptereduc.notifyDataSetChanged();

    }
}

