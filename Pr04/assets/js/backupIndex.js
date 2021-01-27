var input = document.getElementById("userIn");
var quanti = document.getElementById("quanti");
var lista = document.getElementsByTagName("li");

var item;

// Quando viene premuto il tasto Invio chiama la funzione aggiungi
input.addEventListener("keypress", function(event){
    if(event.key == "Enter" && input.value != ""){
        event.preventDefault();
        document.getElementById("add").click();
    }
});

// prende i valori che scrive l'utente nei tag di input, li combina e li scrive in un nuovo tag li
function aggiungi(){
    var listGen= document.getElementById("lista");
    var update = false;

    // cerca tra tutte i tag li se esiste gi� un elemento con quello che ha scritto l'utente, se c'� allora aggiorna il valore di quel tag li
    for(let i=0; i<listGen.childElementCount; i++){
        if(lista[i].textContent.includes(input.value)){
            item = lista[i].textContent.split(" ");
            lista[i].innerHTML = (parseInt(item[0]) + parseInt(quanti.value)) + " " + item[1];

            update = true;
        }
    }

    // se quello che scritto l'utente non � presente nei tag li allora ne crea uno nuovo e assegna quello che scrive l'utente nel nuovo li
    if(!update){
        var newItem = document.createElement("li");
        newItem.textContent = quanti.value + " " + input.value;
        listGen.appendChild(newItem);
    }

    quanti.value = 1;
}

// cerca tra tutti i tag li per quello che ha scritto l'utente in input e lo rimuove
function rimuovi(){
    // se si prova a rimuovere qualcosa da una lista vuota scrive che non c'� niente nella lista
    try{
        var gen = lista[0].parentNode;
    }
    catch(TypeError){
        alert("Nessun oggetto nella lista");
    }

    for(let i=0;i<lista.length;i++){
        if(lista[i].textContent.includes(input.value)){
            item = lista[i].textContent.split(" ");

            // se la quantit� inserita dall'utente � superiore a quella presente nella lista allora rimuove l'li senn� aggiora il valore
            if(quanti.value < item[0]){
                lista[i].innerHTML = (item[0] - quanti.value) + " " + item[1];
            }
            else{
                gen.removeChild(lista[i]);
            }

            break;
        }
    }
}
