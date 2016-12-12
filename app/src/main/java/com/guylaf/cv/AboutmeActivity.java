package com.guylaf.cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class AboutmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        ImageView image = (ImageView) findViewById(R.id.imageAboutme);
        Picasso.with(this).load(R.drawable.guy).fit().centerCrop().into(image);

        TextView displayTitle = (TextView) findViewById(R.id.textAboutme);
        displayTitle.setText("Depuis 2010,  Educateur bénévole à l’école de tennis du club de la Pierre Rouge Montpellier \n" +
                " \n" +
                "Diplômes obtenus durant cette période : \n" +
                " \n" +
                "2011 – 2012 Certificat de qualification professionnelle d'Assistant Moniteur de Tennis (formation suivie en parallèle du Master MEF) \n" +
                " \n" +
                "2010 - 2012    Master MEF (Métiers de l’enseignement et de la formation), IUFM  Montpellier Incluant 3 mois de stage en école primaire (maternelle à CM2), dont 1 mois en SOPA (Stage observation et prise en main de la classe), un mois en SR (Stage en responsabilité = remplacement du professeur titulaire, aide personnalisée), et 1 mois en stage à l’étranger (Sénégal) C2I2E Anglais niveau CLES 2 \n" +
                " \n" +
                "Avant 2010, Responsable informatique, Consultant PeopleSoft \n" +
                " \n" +
                "2008 - 2010 Consultant  PEOPLESOFT CARREFOUR  DSI GROUPE (Evry 91) \n" +
                " \n" +
                "2007   Consultant PEOPLESOFT BULL SERVICES (St Ouen 93)  \n" +
                " \n" +
                "2002 - 2007 Responsable des Domaines Informatiques RH, Finances, Commercial, Juridique, Filiales, Directeur de projet, Chef de projet, Responsable Service Support BRINK’S FRANCE (Paris 9éme)  \n" +
                " \n" +
                "2001 Chef de projet PAYE/RH CA2I (Filiale APAVE Marseille 13)   \n" +
                " \n" +
                "1999 – 2001 Chef de projet HYPERVISION, Ingénieur Application PEOPLESOFT PAYROLL ADP-GSI (Levallois Perret 92) missionné par COGNICASE INGENIERIE (Paris la Défense 92)   \n" +
                " \n" +
                "1996 – 1998 Responsable maintenance logiciel de paye  SSII INFORMATIQUE SERVICE (Montpellier/Fabrégues 34) \n" +
                " \n" +
                "1984 – 1996 Missions de développement, Service Support au sein de diverses sociétés et SSII ");

    }

}
