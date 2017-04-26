
    create table PUBLIC."USER" (
       USERNAME varchar(255) not null,
        FIRSTNAME varchar(255),
        LASTNAME varchar(255),
        "PASSWORD" binary(255) not null,
        primary key (USERNAME)
    );
