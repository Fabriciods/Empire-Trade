package br.com.tradeempire

import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.async.KtxAsync

class TradeEmpire : KtxGame<KtxScreen>() {
    override fun create() {
        KtxAsync.initiate()
    }
}
