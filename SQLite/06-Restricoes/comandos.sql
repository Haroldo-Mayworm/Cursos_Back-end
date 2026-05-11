CREATE TABLE "usuario" (
  "id" INTEGER PRIMARY KEY,
  "email" TEXT NOT NULL COLLATE NOCASE UNIQUE,
  "nome" TEXT NOT NULL,
  "tipo" TEXT NOT NULL DEFAULT 'usuario' CHECK ("tipo" IN ('usuario', 'admin')),
  "vitalicio" INTEGER DEFAULT 0 CHECK ("vitalicio" IN (0,1)),
  "criado" TEXT DEFAULT CURRENT_TIMESTAMP
) STRICT;
DROP TABLE "usuario";

INSERT INTO
  "usuario" ("email", "nome", "tipo", "vitalicio")
VALUES
  ('andre5@email.com', 'André', 'admin', 4);

INSERT INTO "usuario" ("email", "nome") VALUES ('AndrE@email.com', 'André');