function controlla(){
    if(document.modulo.cognome.value==""){
        alert("Inserire cognome");
        return false;
    }
    if(document.modulo.nome.value==""){
        alert("Inserire nome");
        return false;
    }
    if(document.modulo.cod==""){
        alert("Inserire codice");
        return false;
    }

    var codice = parseInt(document.modulo.cod.value);
    if(isNaN(codice)){
        alert("Il codice deve essere numerico");
        return false;
    }
    if(document.modulo.regione.value=="nessuna"){
        alert("Selezionare una regione");
        return false;
    }
    if((document.modulo.email.value=="")&&(document.modulo.tel.value=="")){
        alert("Inserire o l'email o il numero di telefono");
        return false;
    }
    alert("Dati inseriti correttamente");
    return true;
}
