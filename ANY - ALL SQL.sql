SELECT COUNT(title) FROM film
WHERE length < ALL
(
SELECT AVG (length) FROM film
);

SELECT COUNT(title) FROM film
WHERE rental_rate = ANY
(
SELECT MAX(rental_rate) FROM film
);

SELECT title,rental_rate,replacement_cost FROM film
WHERE rental_rate = (
SELECT MIN(rental_rate) FROM film
)
AND replacement_cost = (
SELECT MIN(replacement_cost) FROM film
);

SELECT customer_id, COUNT(amount) AS payment_count FROM payment
GROUP BY customer_id
ORDER BY customer_id;