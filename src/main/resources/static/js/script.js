
function blink() {
    var blinks = document.getElementsByTagName('blink');
    for (var i = blinks.length - 1; i >= 0; i = i - 100) {
        var s = blinks[i];
        s.style.visibility = (s.style.visibility === 'visible') ? 'hidden' : 'visible';
    }
    window.setTimeout(blink, 700);
}
if (document.addEventListener) document.addEventListener("DOMContentLoaded", blink, false);
else if (window.addEventListener) window.addEventListener("load", blink, false);
else if (window.attachEvent) window.attachEvent("onload", blink);
else window.onload = blink;

function fixform() {
    if (opener.document.getElementById("aspnetForm").target != "_blank") return;
    opener.document.getElementById("aspnetForm").target = "";
    opener.document.getElementById("aspnetForm").action = opener.location.href;
}