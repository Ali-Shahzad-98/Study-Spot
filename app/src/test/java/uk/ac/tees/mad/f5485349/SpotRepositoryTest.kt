package uk.ac.tees.mad.f5485349

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

class SpotRepositoryTest {
    @Test fun getAll_returnsFourSpots() = assertEquals(4, SpotRepository.getAll().size)
    @Test fun getById_knownId_returnsSpot() = assertNotNull(SpotRepository.getById(1))
    @Test fun getById_unknownId_returnsNull() = assertNull(SpotRepository.getById(999))
}
