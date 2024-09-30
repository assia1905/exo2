package com.example.exo2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editNom, editAdresse, editSurface, editPieces;
    private CheckBox checkboxPiscine;
    private TextView tvImpotBase, tvImpotSupplementaire, tvImpotTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialiser les vues
        editNom = findViewById(R.id.edit_nom);  // Associer au champ "Nom"
        editAdresse = findViewById(R.id.edit_adresse);  // Associer au champ "Adresse"
        editSurface = findViewById(R.id.edit_surface);  // Associer au champ "Surface"
        editPieces = findViewById(R.id.edit_pieces);  // Associer au champ "Nombre de pièces"
        checkboxPiscine = findViewById(R.id.checkbox_piscine);
        tvImpotBase = findViewById(R.id.tv_impot_base);
        tvImpotSupplementaire = findViewById(R.id.tv_impot_supplementaire);
        tvImpotTotal = findViewById(R.id.tv_impot_total);
        Button btnCalculer = findViewById(R.id.btn_calculer);

        // Action du bouton "Calculer Impôt"
        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculerImpot();
            }
        });
    }

    private void calculerImpot() {
        String nom = editNom.getText().toString();
        String adresse = editAdresse.getText().toString();
        String surfaceStr = editSurface.getText().toString();
        String piecesStr = editPieces.getText().toString();

        if (nom.isEmpty() || adresse.isEmpty() || surfaceStr.isEmpty() || piecesStr.isEmpty()) {
            Toast.makeText(this, "Veuillez entrer le nom, l'adresse, la surface et le nombre de pièces", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            int surface = Integer.parseInt(surfaceStr);
            int nbPieces = Integer.parseInt(piecesStr);
            boolean hasPiscine = checkboxPiscine.isChecked();

            // Calcul de l'impôt de base
            int impotBase = surface * 2;

            // Calcul de l'impôt supplémentaire
            int impotSupplementaire = nbPieces * 50 + (hasPiscine ? 100 : 0);

            // Calcul de l'impôt total
            int impotTotal = impotBase + impotSupplementaire;

            // Afficher les résultats dans les TextView correspondants
            tvImpotBase.setText("Impot de base : " + impotBase + " €");
            tvImpotSupplementaire.setText("Impot supplémentaire : " + impotSupplementaire + " €");
            tvImpotTotal.setText("Impot total : " + impotTotal + " €");

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Veuillez entrer des valeurs valides", Toast.LENGTH_SHORT).show();
        }
    }
}
