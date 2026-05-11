PRAGMA foreign_keys = ON;
PRAGMA foreign_keys;

CREATE TABLE "cursos" (
  "id" INTEGER PRIMARY KEY,
  "nome" TEXT
) STRICT;

CREATE TABLE "aulas" (
  "id" INTEGER PRIMARY KEY,
  "curso_id" INTEGER,
  "nome" TEXT,
  FOREIGN KEY ("curso_id") REFERENCES "cursos" ("id") ON DELETE CASCADE ON UPDATE CASCADE
) STRICT;

DROP TABLE "aulas";

INSERT INTO "cursos" ("nome") VALUES ('HTML');
INSERT INTO "aulas" ("curso_id", "nome") VALUES (1, 'Fundamentos do HTML');

DROP TABLE "cursos";

DELETE FROM "cursos" WHERE "id" = 1;

UPDATE "cursos" SET "id" = 2 WHERE "id" = 1;