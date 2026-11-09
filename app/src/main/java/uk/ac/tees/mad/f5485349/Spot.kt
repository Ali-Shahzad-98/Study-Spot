package uk.ac.tees.mad.f5485349

data class Spot(
    val id: Int,
    val name: String,
    val location: String,
    val noiseLevel: String,
    val description: String
)

/** Sprint 1: hard-coded data. Later sprints: web service + Room cache behind this class. */
object SpotRepository {
    private val spots = listOf(
        Spot(1, "Library Quiet Floor", "Main Library, Level 3", "Silent", "Individual desks, power sockets."),
        Spot(2, "Student Hub Cafe", "Student Hub", "Loud", "Good for group work and coffee."),
        Spot(3, "Science Atrium", "Science Building", "Moderate", "Bright, open space with tables."),
        Spot(4, "Computer Lab B", "Business Building", "Quiet", "PCs available, bookable.")
    )

    fun getAll(): List<Spot> = spots
    fun getById(id: Int): Spot? = spots.find { it.id == id }
}
