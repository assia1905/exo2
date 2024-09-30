## README - Application Calcul d'Impôt
## Description du projet
- Cette application Android permet à l'utilisateur de calculer un impôt basé sur plusieurs paramètres : Nom, Adresse, Surface en m², Nombre de pièces, et la présence d'une piscine. L'application affiche ensuite le détail de l'impôt calculé : Impot de base, Impot supplémentaire, et Impot total.
## Fonctionnalités
- Saisie des informations : L'utilisateur saisit son nom, son adresse, la surface du logement, le nombre de pièces, et coche une case si une piscine est présente.
- Calcul de l'impôt : Un bouton Calculer Impôt permet de calculer l'impôt total en fonction des informations fournies.
- Affichage des résultats : Les résultats sont affichés sous forme d'impôt de base, d'impôt supplémentaire, et d'impôt total.
- Validation des champs : L'application vérifie que tous les champs sont remplis avant de procéder au calcul.
## Structure des fichiers
- MainActivity.java : Fichier Java principal qui contient la logique du calcul de l'impôt et l'interaction avec l'interface utilisateur.
- activity_main.xml : Fichier XML de mise en page de l'interface utilisateur, qui comprend les champs pour la saisie des informations et l'affichage des résultats.
## Détails des calculs
- Impot de base : Calculé en multipliant la surface (en m²) par 2.
- Impot supplémentaire : Calculé en multipliant le nombre de pièces par 50, plus un supplément de 100 € si une piscine est présente.
- Impot total : La somme de l'impôt de base et de l'impôt supplémentaire.
## Installation et utilisation
- Cloner le projet : Clonez ou téléchargez ce projet à partir du dépôt GitHub.
- Ouvrir le projet dans Android Studio.
- Exécuter l'application : Sur un appareil Android ou un émulateur.
- Utiliser l'application :
  - Saisissez les informations dans les champs fournis : nom, adresse, surface en m², nombre de pièces, et cochez la case pour indiquer la présence d'une piscine.
  - Cliquez sur le bouton Calculer Impôt.
  - L'application affichera l'impôt de base, l'impôt supplémentaire, et l'impôt total.
## Dépendances et Technologies utilisées
- Langage : Java
- IDE : Android Studio
- Layouts : ConstraintLayout
## Demonstration en video 
- https://github.com/user-attachments/assets/67014169-7b40-4431-a3ed-7b5df5255107
## Auteur
- Assia BOUJNAH

