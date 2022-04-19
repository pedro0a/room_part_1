package ipvc.estg.aula7_turno3.repository

import androidx.annotation.WorkerThread
import ipvc.estg.aula7_turno3.dao.PersonDao
import ipvc.estg.aula7_turno3.model.Person
import kotlinx.coroutines.flow.Flow

class PersonRepository(private val personDao: PersonDao) {

    val allPeople: Flow<List<Person>> = personDao.getOrderedPeople()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(person: Person) {
        personDao.insert(person)
    }
}