var commento = document.getElementById("commento");
var immagine = document.getElementById("immagine");

immagine.addEventListener("keypress", function(event){
    if(event.key == "Enter"){
        event.preventDefault();
        document.getElementById("aggiungi").click();
    }
});

function aggiungiImmagine(){
    var commento = this.commento.value;
    var galleria = document.getElementById("galleria");

    // card
    var newCard = document.createElement("div");
    newCard.classList.add("card");

    cardImg = document.createElement("img");
    cardImg.classList.add("card-img-top");
    cardImg.src = immagine.value

    // il commento
    cardBody = document.createElement("div");
    cardBody.classList.add("card-body");

    testo = document.createElement("p");
    testo.classList.add("card-text");
    testo.innerHTML = commento;
    cardBody.appendChild(testo);

    newCard.appendChild(cardImg);
    newCard.appendChild(cardBody);

    var test = document.createElement("div");
    test.classList.add("col");
    test.classList.add("md-4");
    test.appendChild(newCard);

    galleria.appendChild(test);
}
