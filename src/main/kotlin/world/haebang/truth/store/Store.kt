package world.haebang.truth.store


import javax.persistence.*

@Entity
class Store (
    name: String,
    region: String
) {

    @Id
    @GeneratedValue
    @Column(name = "store_id")
    val id: Long = 0

    var name: String = name
        protected set

    var region: String = region
        protected set
}