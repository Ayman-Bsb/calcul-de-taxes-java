# Projet de Calculateur de Taxes

Ce projet Java calcule les taxes applicables sur différents types de produits, y compris les produits importés, en fonction de règles spécifiques.

## Structure du Projet

src/ main/ java

└── com.taxes/

├── Main.java

├── model/

│ └── Product.java

├── service/

│ ├── TaxCalculator.java

│ └── ReceiptGenerator.java

├── type/

│ ├── ProductType.java

│ └── TaxType.java

└── util/

│ └── TaxUtil.java


## Description des Éléments

| Élément      | Description                                                      |
|--------------|------------------------------------------------------------------|
| `Main.java` | Point d'entrée du programme, utilisé pour exécuter le calcul des taxes. |
| `model/`    | Contient les classes représentant les entités du domaine.        |
| `Product.java` | Représente un produit avec ses propriétés (nom, prix, etc.).     |
| `service/` | Contient la logique métier principale du calcul des taxes.       |
| `TaxCalculator.java` | Calcule les taxes pour les produits.                             |
| `ReceiptGenerator.java`| Génère et imprime les reçus avec les montants des taxes et les totaux. |
| `type/`    | Contient les énumérations définissant les types de produits et de taxes. |
| `ProductType.java` | Enumère les types de produits (Livre, Nourriture, Médicament, etc.). |
| `TaxType.java` | Enumère les types de taxes (BASIC, IMPORT).                      |
| `util/`    | Contient les classes utilitaires pour les fonctions communes.    |
| `TaxUtil.java` | Fournit des méthodes utilitaires pour le calcul des arrondis.    |

## Auteur

Ayman BOUASSAB