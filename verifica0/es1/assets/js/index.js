function potenza(){
    var num = document.getElementsByTagName("input");
    var res = document.getElementById("res");

    res.innerHTML = Math.pow(num[0].value, num[1].value);
}
