create table if not exists Axe (
    id     Integer not null PRIMARY KEY,
    nom    varchar(255),







    tatouage        varchar(255) not null PRIMARY KEY,
    type            varchar(255),
    adresse_ip      varchar(255),
    code_mnemo      varchar(255),
    login           varchar(255),
    password        varchar(255),
    scheme          varchar(10),
    ptz_uri         varchar(255),
    profile_token   varchar(100)
    );