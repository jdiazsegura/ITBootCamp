# Mostrar el titulo y nombre del genero de todas las series

SELECT sr.title , g.name 
FROM series as sr 
LEFT JOIN genres g ON sr.genre_id  = g.id ;


# Mostrar el titulo y los episodios,el nombre y el apellido
# de los actores que trabajan en cada uno de ellos.

SELECT DISTINCT ep.title , ep.`number`, a.first_name , a.last_name 
FROM episodes as ep
JOIN actor_episode ae on ep.id = ae.episode_id 
JOIN actors a on ae.actor_id = a.id
LIMIT 10

# Mostrar el título de todas las series y el total de temporadas que tiene
# cada una de ellas.

SELECT s.title , 
	count(s2.id) as num_seasons
FROM series s 
JOIN seasons s2 on s2.serie_id = s.id 
GROUP BY s.title 

# Mostrar el nombre de todos los géneros y la cantidad total de películas
# por cada uno, siempre que sea mayor o igual a 3

SELECT g.name , COUNT(m.id) 
FROM genres g 
JOIN movies m ON m.genre_id = g.id 
GROUP BY g.name

# Mostrar sólo el nombre y apellido de los actores que trabajan en todas las
# películas de la guerra de las galaxias y que estos no se repitan.

SELECT DISTINCT first_name ,last_name 
FROM actors a 
JOIN actor_movie am ON a.id = am.actor_id 
JOIN movies m ON m.id = am.movie_id 
WHERE m.title LIKE 'La Guerra de las galaxias%';