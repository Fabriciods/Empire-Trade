package br.com.tradeempire.screens

import br.com.tradeempire.TradeEmpire
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import ktx.app.KtxScreen

class MenuScreen(val game:TradeEmpire): KtxScreen {
    val stage = Stage(ScreenViewport())
}
