function aggiungiTesto(){
    var form = document.getElementById("mioForm");

    var div = document.createElement("div");

    var tx = document.createElement("label");
    tx.innerHTML = "testo";

    var testo = document.createElement("input");
    testo.type = "text";

    div.appendChild(tx);
    div.appendChild(testo);

    form.appendChild(div);
}

function aggiungiNum(){
    var form = document.getElementById("mioForm");

    var div = document.createElement("div");

    var tx = document.createElement("label");
    tx.innerHTML = "num";

    var num = document.createElement("input");
    num.type = "number";

    div.appendChild(tx);
    div.appendChild(num);

    form.appendChild(div);
}
