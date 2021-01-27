var img = document.getElementsByTagName("img");
var valoreAttuale = 4;

function sopra(){
    img[0].style.width = "600px";
    img[0].style.height = "600px";
}

function fuori(){
    img[1].style.width = "600px";
    img[1].style.height = "600px";
}

function daCliccare(){
    img[2].style.width = "600px";
    img[2].style.height = "600px";

    this.valoreAttuale += 1;
    console.log(this.valoreAttuale);
}

function dueVolte(){
    img[3].style.width = "600px";
    img[3].style.height = "600px";
}
