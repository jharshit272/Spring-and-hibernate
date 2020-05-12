/**
 * 
 */

//setInterval(function () {document.getElementById("submitId").click();}, 5000)

var seconds_left = 10;
var interval = setInterval(function() {
    document.getElementById('timer_div').innerHTML = --seconds_left;
    
    if (seconds_left <= 0)
    { document.getElementById("submitId").click();
        clearInterval(interval);
    }
}, 1000);