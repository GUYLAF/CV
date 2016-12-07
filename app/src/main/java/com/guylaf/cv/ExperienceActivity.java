package com.guylaf.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ExperienceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        final List<Experience> listexperience = new ArrayList<>();

        listexperience.add(new Experience("2008 - 2010 Consultant  PEOPLESOFT CARREFOUR  DSI GROUPE (Evry 91) ","CARREFOUR DSI GROUPE (Evry 91) avril 2008 – mai 2010 Consultant technico-fonctionnel PEOPLESOFT module AM : Dans le cadre du Centre de Compétence Finance & Ressources Humaines (support monde 26 pays), au sein du pôle AM :   - Gestion des anomalies et évolutions : " +
                "Mise en place des contrôles au niveau de l’AMDPCACL et des transactions (Création (ADD), Transfert (TRF), Ajustement (ADJ), Cession (RET), remise en service (REI), Recatégorisation (RCT), Book adjustment (BKS)) pour stopper la génération d’anomalies.   Identification des historiques en anomalies (ex : une immo sur 2 catégories ; solution =  création scripts de correction après choix, par le métier, de la catégorie à garder) \n" +
                "- Pilotage du sous-traitant offshore (Accenture Ile Maurice) : mise en place process de gestion des anomalies,  gestion fichier de suivi,  analyse des chiffrages,  validation des solutions o tests des solutions préconisées par le sous-traitant o investigations pour trouver des solutions pour les anomalies non résolues par le sous-traitant" +
                "- Réalisation des évolutions (AMDPCALC, contrôles pannels, …) et des corrections en delta avec chiffrage du sous traitant : recueil du besoin, analyse fonctionnelle, développements (SQR, Peoplecode), tests unitaires, et mise en PROD (migration) \n" +
                "- Développement outil de fusion (transfert immos d’une BU vers une autre BU) basé sur standard MASSCHANGE. ORACLE 10G, PeopleSoft 8.4, Tools 8.46, SQL, SQR, AE, PeopleCode, TOAD"));
        listexperience.add(new Experience("2007   Consultant PEOPLESOFT BULL SERVICES (St Ouen 93)"," "));
        listexperience.add(new Experience("2002 - 2007 Responsable des Domaines Informatiques RH, Finances, Commercial, Juridique, Filiales, Directeur de projet, Chef de projet, Responsable Service Support BRINK’S FRANCE (Paris 9éme)"," "));
        listexperience.add(new Experience("2001 Chef de projet PAYE/RH CA2I (Filiale APAVE Marseille 13) ",""));
        listexperience.add(new Experience("1999 – 2001 Chef de projet HYPERVISION, Ingénieur Application PEOPLESOFT PAYROLL ADP-GSI (Levallois Perret 92) missionné par COGNICASE INGENIERIE (Paris la Défense 92)"," "));
        listexperience.add(new Experience("1996 – 1998 Responsable maintenance logiciel de paye  SSII INFORMATIQUE SERVICE (Montpellier/Fabrégues 34) "," "));
        listexperience.add(new Experience("1984 – 1996 Missions de développement, Service Support au sein de diverses sociétés et SSII "," "));

        final ListView listView = (ListView) findViewById(R.id.listexperience);
        final Adapter adapter = new Adapter(this);
        listView.setAdapter(adapter);
        adapter.setList(listexperience);
        adapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Experience experience = adapter.getItem(position);
                String libeldetail = experience.getLibelDetail();
                Intent intent = new Intent(ExperienceActivity.this, DetailExperience.class);
                intent.putExtra("Libeldetail",libeldetail);
                startActivity(intent);
            }
        });
    }
}
