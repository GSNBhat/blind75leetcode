



Select
	*
from
	(
		select
			event.title,
			event.dt,
			RANK() OVER (
				PARTITION BY owners.id
				ORDER BY
					event.dt asc
			) rankofdts,
			owners.email,
			owners.full
		FROM
			owners,
			event
		where
			owners.id = event.owner_id
			and owners.vaction != 1
			
	)
where
 	rankofdts <= 5
order by dt



