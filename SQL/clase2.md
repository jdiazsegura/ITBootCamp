## Clase 2 SQL


####  Practica 1  

Mostrar el titulo y nombre del genero de todas las series

```sql
SELECT sr.title , g.name 
FROM series as sr 
LEFT JOIN genres g ON sr.genre_id  = g.id ;
```

|title|name|
|-----|----|
|Game of Thrones|Fantasia|
|Supernatural|Suspenso|
|The Walking Dead|Terror|
|Person of Interest|Accion|
|The Big Bang Theory|Comedia|
|Breaking Bad|Drama|
|


####  Practica 2

Mostrar el titulo y los episodios,el nombre y el apellido
de los actores que trabajan en cada uno de ellos.

```sql
SELECT DISTINCT ep.title , ep.`number`, a.first_name , a.last_name 
FROM episodes as ep
JOIN actor_episode ae on ep.id = ae.episode_id 
JOIN actors a on ae.actor_id = a.id
```

|title|number|first_name|last_name|
|-----|------|----------|---------|
|Winter Is Coming|1|Emilia|Clarke|
|Winter Is Coming|1|Peter|Dinklage|
|Winter Is Coming|1|Kit|Harington|
|The North Remembers|1|Emilia|Clarke|
|The North Remembers|1|Peter|Dinklage|
|The North Remembers|1|Kit|Harington|
|Valar Dohaeris|1|Emilia|Clarke|
|Valar Dohaeris|1|Peter|Dinklage|
|Two Swords|1|Emilia|Clarke|
|Two Swords|1|Peter|Dinklage|
|

####  Practica 3

Mostrar el título de todas las series y el total de temporadas que tiene
cada una de ellas.

```sql
SELECT s.title , 
	count(s2.id) as num_seasons
FROM series s 
JOIN seasons s2 on s2.serie_id = s.id 
GROUP BY s.title 
```

|title|num_seasons|
|-----|-----------|
|Game of Thrones|7|
|Supernatural|12|
|The Walking Dead|7|
|Person of Interest|5|
|The Big Bang Theory|10|
|Breaking Bad|5|
|


####  Practica 4

Mostrar el nombre de todos los géneros y la cantidad total de películas
por cada uno, siempre que sea mayor o igual a 3.

```sql
SELECT g.name , COUNT(m.id) 
FROM genres g 
JOIN movies m ON m.genre_id = g.id 
GROUP BY g.name
```

|name|COUNT(m.id)|
|----|-----------|
|Comedia|1|
|Drama|3|
|Ciencia Ficcion|5|
|Suspenso|1|
|Animacion|4|
|Aventuras|3|
|Infantiles|2|
|

####  Practica 5

Mostrar sólo el nombre y apellido de los actores que trabajan en todas las
películas de la guerra de las galaxias y que estos no se repitan.

```sql
SELECT DISTINCT first_name ,last_name 
FROM actors a 
JOIN actor_movie am ON a.id = am.actor_id 
JOIN movies m ON m.id = am.movie_id 
WHERE m.title LIKE 'La Guerra de las galaxias%';
```

|first_name|last_name|
|----------|---------|
|Mark|Hamill|
|Harrison|Ford|
|Carrie|Fisher|
