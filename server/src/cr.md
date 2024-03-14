Reponse question 3:

J'ai choisi le mode "@Inheritance(strategy = InheritanceType.JOINED)"
parce que c'est le plus optimal pour ce genre de representation
si post vaut M, alors une requête
avec une jointure sur la table
Manager va être faite pour
récupérer toutes les informations et si post vaut D, alors une requête
avec une jointure sur la table
Developpeur va être faite pour
récupérer toutes les informations, et c'est mieux que le type "SINGLE_TABLE"
parce que on aura des champs null dans la table Developpeur et Manager