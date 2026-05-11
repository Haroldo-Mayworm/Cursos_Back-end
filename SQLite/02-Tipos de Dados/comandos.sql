CREATE TABLE "produtos" (
  "id" INT,
  "descontinuado" TINYINT,
  "nome" VARCHAR(100),
  "preco" DECIMAL(10, 2),
  "descricao" TEXT,
  "data_criacao" DATETIME
);

INSERT INTO
  "produtos" ("id", "descontinuado", "nome", "preco", "descricao", "data_criacao")
VALUES
  (1, 0, 'Notebook', 200.5, null, '24-10-2049');

SELECT "id", typeof("data_criacao") FROM "produtos";

INSERT INTO
  "produtos" ("id", "descontinuado", "nome", "preco", "descricao", "data_criacao")
VALUES
  ('1', '0', 999, '200.50', 100, 2049);

SELECT * FROM "produtos";
