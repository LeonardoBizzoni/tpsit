let test = new Date();
inizio = test.getTime();

function daysInMonth(mese){
    return new Date(2021,mese,0).getDate();
}

var giorniSet = ["lunedi","martedi","mercoledi","giovedi","venerdi","sabato","domenica"];
var mesi = ["gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosto","settembre","ottobre","novembre","dicembre"];

var giorni = document.getElementById("giorni");

var testo = "";
var g=0;

for(let i=1;i<=mesi.length;i++){
    for(let j=1;j<=daysInMonth(i);j++){
        if(g > 50){
            break;
        }
        var date = new Date(2021,i,j);
        testo += j+" "+mesi[i-1]+"=" + giorniSet[date.getDay()]+"\n";
        g++;
    }
        if(g > 50){
            break;
        }
}

test1 = new Date();
fine = test1.getTime();
testo += parseInt(fine)-parseInt(inizio) + "s";

giorni.innerText = testo;
