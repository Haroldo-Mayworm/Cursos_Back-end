CREATE TABLE "cursos" (
"id" INTEGER PRIMARY KEY,
"nome" TEXT,
"preco" INTEGER
) STRICT;

DROP TABLE "cursos";

INSERT INTO
"cursos" ("id", "nome", "preco")
VALUES
(20, 'HTML', 1000);

INSERT INTO
"cursos" ("nome", "preco")
VALUES
('HTML', 1000);

CREATE TABLE "aulas" (
"curso_id" INTEGER,
"nome" TEXT
);

INSERT INTO
"aulas" ("curso_id", "nome")
VALUES
(1, 'Fundamentos do CSS');

SELECT rowid, _ FROM "aulas";
SELECT rowid, _ FROM "cursos";
