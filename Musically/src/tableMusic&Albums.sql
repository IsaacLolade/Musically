CREATE TABLE Albumes(
id_album      varchar(20) not null, 
artist       varchar(30) not null,
genero       varchar(20) not null,
descripcion   varchar(500) not null,
portada       blob,
url           longtext,
primary key(id_album));


CREATE TABLE Canciones(
id_cancion         varchar(40) not null,
artista            varchar(30) not null,
duracion           varchar(8),
genero             varchar(20) not null, 
album              varchar(20),
portada            blob,
descripcion        varchar(500) not null,
url           longtext,
primary key(id_cancion),
foreign key(album) references Albumes(id_album));