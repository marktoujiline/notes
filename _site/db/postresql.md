# PostgreSQL

## Startup
https://hub.docker.com/_/postgres
### docker
* https://hub.docker.com/_/postgres
* https://hub.docker.com/r/mdillon/postgis/

`docker run --name postgres -e POSTGRES_PASSWORD=password -d postgres`

#### Install vim inside container
```
> apt-get update
> apt-get -Syu install vim
```

### docker-compose
docker-compose.yml
```
# Use postgres/example user/password credentials
version: '3.1'

services:

  db:
    image: postgres
    restart: always
    environment:
      POSTGRES_PASSWORD: example

  adminer:
    image: adminer
    restart: always
    ports:
      - 8080:8080
```

## Running
```
docker exec -it postgres /bin/bash           // enter container
> psql --username=postgres                   // enter cli mode
> psql --username=postgres -f file.sql       // execute sql file (file in container)
```

## Commands
```
\l                    // list database
\c <database>         // connect to database
\dt                   // list tables in database
\d <table>            // describe table
\q                    // exit
```

## PSQL
### Tables
```
CREATE TABLE films (
    code        char(5) CONSTRAINT firstkey PRIMARY KEY,
    title       varchar(40) NOT NULL,
    did         integer NOT NULL,
    date_prod   date,
    kind        varchar(10),
    len         interval hour to minute
);
CREATE TABLE IF NOT EXISTS films (...);
DROP TABLE <table>;
DROP TABLE IF EXISTS <table>;
```
### Query
```
SELECT * FROM films;
SELECT * FROM films WHERE did=105;
SELECT * FROM films WHERE did=ANY(ARRAY[105, 106]);
SELECT did from films WHERE title='Bananas';
SELECT * FROM films WHERE did=ANY(SELECT did from films WHERE title='Bananas');
```

### Insert
```
INSERT INTO films VALUES ('UA502', 'Bananas', 105, '1971-07-13', 'Comedy', '82 minutes');
INSERT INTO films VALUES ('UA503', 'Bananas', 106, '1971-07-14', 'Comedy', '81 minutes');
INSERT INTO films VALUES ('UA504', 'Apple', 107, '1971-07-14', 'Comedy', '81 minutes');
```

## Constraints
* PRIMARY_KEY: A column whose fields uniquely identify row. Each field must be unique. Cannot have null. Table can have only 1 such column.
    * Multiple fields together can form PRIMARY_KEY. Called composite key
 ```
 CREATE TABLE tags (
    question_id INTEGER NOT NULL,
    tag_id SERIAL NOT NULL,
    tag1 VARCHAR(20),
    tag2 VARCHAR(20),
    tag3 VARCHAR(20),
    PRIMARY KEY(question_id, tag_id)
);
```

## Indexes
Used to enhance database performance. Improve speed for lookup for specific columns, but add overhead to entire DB. Only use for columns frequently accessed.

### Types
https://www.citusdata.com/blog/2017/10/17/tour-of-postgres-index-types/
* B-Tree - For most datatypes and queries
* GIN - For JSONB/hstore/arrays
    * GIN is designed for handling cases where the items to be indexed are composite values, and the queries to be handled by the index need to search for element values that appear within the composite items. For example, the items could be documents, and the queries could be searches for documents containing specific words.
* GiST - For full text search and geospatial datatypes
* SP-GiST - For larger datasets with natural but uneven clustering
* BRIN - For really large datasets that line up sequentially
* Hash - For equality operations, and generally B-Tree still what you want here

## Postgis
http://postgis.net/
> It adds support for geographic objects allowing location queries to be run in SQL.

