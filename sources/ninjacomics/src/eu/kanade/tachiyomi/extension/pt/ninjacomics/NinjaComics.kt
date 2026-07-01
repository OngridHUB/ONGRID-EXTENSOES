package eu.kanade.tachiyomi.extension.pt.ninjacomics

import eu.kanade.tachiyomi.multisrc.madara.Madara
import keiyoushi.annotation.Source
import keiyoushi.network.rateLimit

@Source
abstract class NinjaComics : Madara() {
    override val client = super.client.newBuilder()
        .rateLimit(2)
        .build()
}
