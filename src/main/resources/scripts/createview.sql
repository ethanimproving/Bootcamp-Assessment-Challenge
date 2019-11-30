CREATE VIEW totalAmountSpent AS
	SELECT purchaser, sum(costPerProduct*quantity) AS totalAmountSpent
    FROM improving.purchases
    GROUP BY purchaser;

