--
-- File generated with SQLiteStudio v3.0.7 on mån apr 4 13:37:51 2016
--
-- Text encoding used: windows-1252
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: participant
CREATE TABLE participant (sid INTEGER REFERENCES guides (gid));

-- Table: safari
CREATE TABLE safari (sid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sname STRING NOT NULL, splace STRING NOT NULL, sspots INTEGER NOT NULL, sdate DATE NOT NULL, gid INTEGER NOT NULL REFERENCES guides (gid), sspotsmax INTEGER, sspotsmin);

-- Table: costumer
CREATE TABLE costumer (cpnr INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, cname STRING NOT NULL, csex STRING NOT NULL, ctype INTEGER, cemail STRING);
INSERT INTO costumer (cpnr, cname, csex, ctype, cemail) VALUES (1, 'Pontus Öberg', 'Male', NULL, NULL);
INSERT INTO costumer (cpnr, cname, csex, ctype, cemail) VALUES (2, 'Emma Karlsson', 'Female', NULL, NULL);
INSERT INTO costumer (cpnr, cname, csex, ctype, cemail) VALUES (3, 'Anton Berglud', 'Male', NULL, NULL);
INSERT INTO costumer (cpnr, cname, csex, ctype, cemail) VALUES (4, 'Jack Petré', 'Male', NULL, NULL);
INSERT INTO costumer (cpnr, cname, csex, ctype, cemail) VALUES (5, 'Johan Frölin', 'Female', NULL, NULL);

-- Table: workers
CREATE TABLE workers (wpnr INTEGER PRIMARY KEY AUTOINCREMENT, wname STRING, wphone STRING, wemail STRING, wrole STRING);

-- Table: guides
CREATE TABLE guides (gid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, gname STRING NOT NULL, gsex STRING NOT NULL, gemail STRING);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
