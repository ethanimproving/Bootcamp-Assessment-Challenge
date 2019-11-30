DROP TABLE IF EXISTS purchases;
CREATE TABLE purchases(
   purchaseId     INT AUTO_INCREMENT NOT NULL PRIMARY KEY
  ,product        VARCHAR(96) NOT NULL
  ,purchaser      VARCHAR(48) NOT NULL
  ,quantity       INT  NOT NULL
  ,costPerProduct DECIMAL (4, 2) NOT NULL
);