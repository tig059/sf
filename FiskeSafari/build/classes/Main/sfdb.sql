--
-- File generated with SQLiteStudio v3.0.7 on fre apr 8 13:15:54 2016
--
-- Text encoding used: windows-1252
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: admin
CREATE TABLE admin (aId STRING PRIMARY KEY, aPassword STRING);
INSERT INTO admin (aId, aPassword) VALUES ('admin2', 'Kenneby');
INSERT INTO admin (aId, aPassword) VALUES ('admin1', 'Fromin');

-- Table: guide
CREATE TABLE guide (gId INTEGER PRIMARY KEY, gName STRING, gPassword STRING);
INSERT INTO guide (gId, gName, gPassword) VALUES (1, 'Sune Simmning', 'Simmning');
INSERT INTO guide (gId, gName, gPassword) VALUES (2, 'Bengt Birkerud', 'Birkerud');
INSERT INTO guide (gId, gName, gPassword) VALUES (3, 'Lars Lassenger', 'Lassenger');
INSERT INTO guide (gId, gName, gPassword) VALUES (4, 'Hilma Halmsjö', 'Halmsjö');

-- Table: custumer
CREATE TABLE custumer (cId INTEGER PRIMARY KEY, cName STRING, cSex STRING, cEmail STRING, cPassword STRING);
INSERT INTO custumer (cId, cName, cSex, cEmail, cPassword) VALUES (111, 'P', 'Male', 'Email', 222);
INSERT INTO custumer (cId, cName, cSex, cEmail, cPassword) VALUES (5010101, 'pontus', 'Male', 'aiosdf', 'asdf');
INSERT INTO custumer (cId, cName, cSex, cEmail, cPassword) VALUES (8701019999, 'Zlatan Ibra', 'Male', 'zlata@hotmail.com', 'zlatanäger');
INSERT INTO custumer (cId, cName, cSex, cEmail, cPassword) VALUES (9501098932, 'Pontus Öberg', 'Male', 'pontus@hot', 'fuskfitta321');
INSERT INTO custumer (cId, cName, cSex, cEmail, cPassword) VALUES (9608160751, 'Jack Petre', 'Male', 'jackplex@hotmail.se', 'hej123');

-- Table: participant
CREATE TABLE participant (cId INTEGER REFERENCES custumer (cId), sId INTEGER REFERENCES guide, pAccommodation STRING, pAmount INTEGER, pEquipment INTEGER, pHasPaid BOOLEAN);

-- Table: safari
CREATE TABLE safari (sId INTEGER PRIMARY KEY, sName STRING, sPlace STRING, sSpotsMax INTEGER, sDate DATE, gId INTEGER REFERENCES guide (gId), sSpotsTaken INTEGER, sEquipementLeft INTEGER, gInfo STRING, cInfo STRING);
INSERT INTO safari (sId, sName, sPlace, sSpotsMax, sDate, gId, sSpotsTaken, sEquipementLeft, gInfo, cInfo) VALUES (1, 'asdf', 'asdf', 2, 1, 1, 4, 'asdf', 'ASDF', 'ASDF');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
