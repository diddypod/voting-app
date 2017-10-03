# Webview App for EC, BPHC

*This app was made for the Students' Union Elections of BITS Pilani, Hyderabad Campus, 2017.*

The application allows an IP address to be entered and uses basic hardcoded password authentication. Next, the app opens the voting portal hosted at the IP in a WebView. Using the hardware back button shuts down the app, as a security measure.

Target devices were exclusively running Android 4.0, necessitating backwards compatibility, removal of JavaScript support, and the addition of a floating back button.

The code for the portal is hosted *[here](https://github.com/legobridge/vote_portal)*.