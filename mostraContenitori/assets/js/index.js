function mostraRoba(reg){
    let nomeReg = document.getElementById("nomeRegione");
    nomeReg.textContent = reg.textContent;

    if(reg.classList.value == "giallo")
        changeCss("giallo");
    else if(reg.classList.value == "arancio"){
        changeCss("arancio");
    }
    else{
        changeCss("rosso");
    }
}

function changeCss(id){
    let zone = document.getElementsByTagName("p");
    for(let i=0;i<zone.length;i++){
        if(zone[i].id == id)
            zone[i].style.display = "block";
        else
            zone[i].style.display = "none";
    }
}
