package dk.mabs.webview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview1.settings.cacheMode = android.webkit.WebSettings.LOAD_CACHE_ELSE_NETWORK;
        webview1.settings.blockNetworkLoads = false;

        webview1.loadUrl("https://readium2.herokuapp.com/pub/L2FwcC9taXNjL2VwdWJzL2NoaWxkcmVucy1saXRlcmF0dXJlLmVwdWI=/EPUB/s04.xhtml")


        android.webkit.WebView.setWebContentsDebuggingEnabled(true);
    }
}
