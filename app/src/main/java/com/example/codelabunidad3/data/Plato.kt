package com.example.codelabunidad3.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.codelabunidad3.R

data class Plato(
    @StringRes val nombre:Int,
    @DrawableRes val imagen:Int,
    @StringRes val descripcion:Int
)

val platos = listOf(
    Plato(R.string.ajiaco, R.drawable.ajiaco, R.string.ajiaco_desc),
    Plato(R.string.arepa_de_huevo, R.drawable.arepa_de_huevo, R.string.arepa_de_huevo_desc),
    Plato(R.string.arepas, R.drawable.arepas, R.string.arepas_desc),
    Plato(R.string.arroz_de_camaron, R.drawable.arros_de_camaron, R.string.arroz_de_camaron_desc),
    Plato(R.string.bandeja_paisa, R.drawable.bandeja_paisa, R.string.bandeja_paisa_desc),
    Plato(R.string.bunuelos, R.drawable.bunuelos, R.string.bunuelos_desc),
    Plato(R.string.carimanolas, R.drawable.carimanolas, R.string.carimanolas_desc),
    Plato(R.string.ceviche, R.drawable.ceviche, R.string.ceviche_desc),
    Plato(R.string.chicharron, R.drawable.chicharron, R.string.chicharron_desc),
    Plato(R.string.chuletas_de_cerdo, R.drawable.chuletas_de_cerdo, R.string.chuletas_de_cerdo_desc),
    Plato(R.string.coctel_de_camarones, R.drawable.coctel_de_camarones, R.string.coctel_de_camarones_desc),
    Plato(R.string.empanadas_de_carne, R.drawable.empanadas_de_carne, R.string.empanadas_de_carne_desc),
    Plato(R.string.fritanga, R.drawable.fritanga, R.string.fritanga_desc),
    Plato(R.string.langosta, R.drawable.langosta, R.string.langosta_desc),
    Plato(R.string.lechona, R.drawable.lechona, R.string.lechona_desc),
    Plato(R.string.mote_de_queso, R.drawable.mote_de_queso, R.string.mote_de_queso_desc),
    Plato(R.string.natilla, R.drawable.natilla, R.string.natilla_desc),
    Plato(R.string.papas_rellenas, R.drawable.papas_rellenas, R.string.papas_rellenas_desc),
    Plato(R.string.pastas_con_albondigas, R.drawable.pastas_con_albondigas, R.string.pastas_con_albondigas_desc),
    Plato(R.string.patacones, R.drawable.patacones, R.string.patacones_desc),
    Plato(R.string.pescado_frito, R.drawable.pescado_frito, R.string.pescado_frito_desc),
    Plato(R.string.pollo_asado, R.drawable.pollo_asado, R.string.pollo_asado_desc),
    Plato(R.string.pollo_broaster, R.drawable.pollo_broaster, R.string.pollo_broaster_desc),
    Plato(R.string.pure_de_papa, R.drawable.pure_de_papa, R.string.pure_de_papa_desc),
    Plato(R.string.sopa_de_cangrejo, R.drawable.sopa_de_cangrejo, R.string.sopa_de_cangrejo_desc),
    Plato(R.string.sopa_de_costilla, R.drawable.sopa_de_costilla, R.string.sopa_de_costilla_desc),
    Plato(R.string.sopa_de_frijoles, R.drawable.sopa_de_frijoles, R.string.sopa_de_frijoles_desc),
    Plato(R.string.sopa_de_lentejas, R.drawable.sopa_de_lentejas, R.string.sopa_de_lentejas_desc),
    Plato(R.string.sopa_de_mariscos, R.drawable.sopa_de_mariscos, R.string.sopa_de_mariscos_desc),
    Plato(R.string.tamales, R.drawable.tamales_hallacas, R.string.tamales_desc),

)
