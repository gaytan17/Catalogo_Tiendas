package zuniga.ricardo.catalogodetiendas

import java.util.UUID

data class Tiendas(
    val id: UUID,
    val nombre: String,
    val telefono: String
)
