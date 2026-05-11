CREATE TABLE "cursos" (
  "id" INTEGER,
  "nome" TEXT,
  "preco" INTEGER
) STRICT;

CREATE TABLE "cursos2" (
  "id" INTEGER,
  "nome" VARCHAR(100),
  "preco" INTEGER
);
DROP TABLE "cursos2";

INSERT INTO
  "cursos" ("id", "nome", "preco")
VALUES
  ('dsa', 'HTML', 1000);

SELECT TYPEOF("id") FROM "cursos";