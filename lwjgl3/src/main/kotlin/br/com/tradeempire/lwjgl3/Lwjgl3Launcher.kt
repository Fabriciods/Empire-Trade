@file:JvmName("Lwjgl3Launcher")

package br.com.tradeempire.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import br.com.tradeempire.TradeEmpire

/** Launches the desktop (LWJGL3) application. */
fun main() {
    // This handles macOS support and helps on Windows.
    if (StartupHelper.startNewJvmIfRequired())
      return
    Lwjgl3Application(TradeEmpire(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("TradeEmpire")
        setWindowedMode(640, 480)
        //setFullscreenMode(Lwjgl3ApplicationConfiguration.getDisplayMode())
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
