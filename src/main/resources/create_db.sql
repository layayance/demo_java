create table if not exists Axe (
    id     Integer not null PRIMARY KEY,
    id_axe        integer,
    nom_axe       varchar(255),
    nom_usage     varchar(255),
    code_type_axe varchar(255),
    lib_type_axe  varchar(255),
    secteurs      varchar(255)
    );